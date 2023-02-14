import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 450;
    static final int SCREEN_HEIGHT = 450;
    static final int UNIT_SIZE = 50;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 100;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        if(running){
            //desenhando pontos
            g.setColor(Color.gray);
            g.setFont(new Font("Comic Sans", Font.PLAIN, 35));
            FontMetrics fm = getFontMetrics(g.getFont());
            g.drawString("Pontos:" + Integer.toString(applesEaten), (SCREEN_WIDTH - fm.stringWidth(Integer.toString(applesEaten)))/3, SCREEN_HEIGHT/9);

            //desenhando maçã
            g.setColor(Color.red);
            g.fillRect(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for(int i = 0; i < bodyParts; i++){ //enquanto existir partes do corpo da cobrinha
                if(i == 0){ //se é a cabeça da cobrinha
                    g.setColor(new Color(41, 146, 44));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); //desenha a cabeça com a cor da linha de cima
                }
                else{ // se é o corpo da cobrinha
                    g.setColor(new Color(120, 188, 80));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); //desenha o corpo com a cor da linha de cima
                }
            }
        }
        else{
            gameOver(g);
        }
    }

    public void newApple(){
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }

    public void move(){
        for(int i = bodyParts;i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(direction){
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
            break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
            break;
            case 'L':
            x[0] = x[0] - UNIT_SIZE;
            break;
            case 'R':
            x[0] = x[0] + UNIT_SIZE;
        break;
        }
    }

    public void checkApple(){
        if((x[0] == appleX) && (y[0] == appleY)){
            newApple();
            applesEaten++;
            bodyParts ++;
        }
    }

    public void checkCollisions(){
        //checagem de se a cabeça da cobrinha está colidindo com o corpo
        for(int i = bodyParts; i>0; i--){
            if((x[0] == x[i])&&(y[0] == y[i])){
                running = false;
            }
        }

        //checagem de colisão com a maçã
        //if(x[0] = )

        //checagem de se a cabeça da cobrinha está colidindo com os cantos da tela
        if(x[0] < 0){
            running = false;
        }
        if(x[0] > SCREEN_WIDTH){
            running = false;
        }
        if(y[0] > SCREEN_HEIGHT){
            running = false;
        }
        if(y[0] < 0){
            running = false;
        }
        if(!running){
            timer.stop();
        }
    }

    public void gameOver(Graphics g){
    //desenhando texto de fim de jogo
        g.setColor(Color.red);
        g.setFont(new Font("Comic Sans", Font.BOLD, 50));
        FontMetrics fm = getFontMetrics(g.getFont());
        g.drawString("Fim de jogo!", (SCREEN_WIDTH - fm.stringWidth("Fim de jogo!"))/2, SCREEN_HEIGHT/2);
    //desenhando pontos
        g.setColor(Color.gray);
        g.setFont(new Font("Comic Sans", Font.PLAIN, 35));
        FontMetrics fm2 = getFontMetrics(g.getFont());
        g.drawString("Pontos:" + Integer.toString(applesEaten), (SCREEN_WIDTH - fm2.stringWidth(Integer.toString(applesEaten)))/3, SCREEN_HEIGHT/9);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                break;
                
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                break;
                
                case KeyEvent.VK_UP:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                break;
                
                case KeyEvent.VK_DOWN:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                break;
            }
        }
    }
}