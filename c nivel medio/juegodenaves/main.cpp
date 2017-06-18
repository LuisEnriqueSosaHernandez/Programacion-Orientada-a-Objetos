    #include <iostream>
    #include <stdio.h>
    #include <windows.h>
    #include <conio.h>
    #include <stdlib.h>
    #include<list>
    using namespace std;
    #define ARRIBA 72
    #define IZQUIERDA 75
    #define DERECHA 77
    #define ABAJO 80

    void gotoxy(int x,int y){
        HANDLE hCon;
        hCon=GetStdHandle(STD_OUTPUT_HANDLE);
        COORD dwPos;
        dwPos.X=x;
        dwPos.Y=y;
        SetConsoleCursorPosition(hCon, dwPos);

    }

    void OcultarCursor(){
    HANDLE hCon;
        hCon=GetStdHandle(STD_OUTPUT_HANDLE);
        CONSOLE_CURSOR_INFO cci;
        cci.dwSize=2;
        cci.bVisible=FALSE;
        SetConsoleCursorInfo(hCon,&cci);
    }
    void pintar_limites(){
        for(int i=2;i<78;i++){

            gotoxy(i,3);printf("%c",205);
            gotoxy(i,33);printf("%c",205);
        }
        for(int i=4;i<33;i++){

            gotoxy(2,i);printf("%c",186);
            gotoxy(77,i);printf("%c",186);
        }
        gotoxy(2,3);printf("%c",201);
        gotoxy(2,33);printf("%c",200);
        gotoxy(77,3);printf("%c",187);
        gotoxy(77,33);printf("%c",188);

    }

    class NAVE{
    int x,y;
    int corazones;
    int vidas;
    public:
    NAVE(int _x,int _y,int _corazones,int _vidas):x(_x),y(_y),corazones(_corazones),vidas(_vidas){}
    int X(){return x;}
    int Y(){return y;}
    int VID(){return vidas;}
    void COR(){corazones--;}
    void pintar();
    void borrar();
    void mover();
    void pintar_corazones();
    void morir();

    };
    void NAVE::pintar(){
    gotoxy(x,y); printf("  %c",30);
    gotoxy(x,y+1);printf(" %c%c%c",60,206,62);
    gotoxy(x,y+2);printf("%c%c %c%c",30,206,206,30);

    }
    void NAVE::borrar(){
    gotoxy(x,y);  printf("        ");
    gotoxy(x,y+1);printf("        ");
    gotoxy(x,y+2);printf("        ");
    }
    void NAVE::mover(){
    if(kbhit()){
               char tecla = getch();
               borrar();
            if(tecla== IZQUIERDA&&x>3)x--;
            if(tecla==DERECHA&&x+6<75)x++;
            if(tecla==ARRIBA&&y>4)y--;
            if(tecla==ABAJO&&y+3<33)y++;
            //if(tecla=='e')corazones--;
            //if(tecla=='r')corazones++;
           pintar();
           pintar_corazones();
            }
    }
    void NAVE::pintar_corazones(){
    gotoxy(50,2);printf("VIDAS %d",vidas);
    gotoxy(64,2);printf("Salud");
    gotoxy(70,2);printf("        ");
    for(int i=0;i<corazones;i++){

        gotoxy(70+i,2);printf("%c",3);
    }

    }
    void NAVE::morir(){
           if(corazones==0){
           borrar();
           gotoxy(x,y);  printf("   **   ");
           gotoxy(x,y+1);printf("  ****  ");
           gotoxy(x,y+2);printf("   **   ");
           Sleep(200);
           borrar();
           gotoxy(x,y);  printf(" * ** *");
           gotoxy(x,y+1);printf("  **** ");
           gotoxy(x,y+2);printf(" * ** *");
           Sleep(200);
           borrar();
           vidas--;
           corazones=3;
           pintar_corazones();
           pintar();
         }

    }
    class AST{
    int x,y;
    public:
        AST(int _x,int _y):x(_x),y(_y){}
        void pintar();
        void mover();
        void choque(class NAVE &N);
        int X(){return x;}
        int Y(){return y;}

    };
    void AST::pintar(){
    gotoxy(x,y); printf("%c",184);
    }
    void AST::mover(){
    gotoxy(x,y);printf(" ");
    y++;
    if(y>32){
        x=rand()%71+4;
        y=4;
    }
    pintar();
    }
    void AST::choque(class NAVE &N){
    if(x>=N.X()&&x<N.X()+6&& y>=N.Y()&&y<=N.Y()+2)
        {
        N.COR();
        N.borrar();
        Sleep(20);
        N.pintar();
        N.pintar_corazones();
        x=rand()%71+4;
        y=4;
    }

    }
    class BALA{
    int x,y;
    public:
        BALA(int _x,int _y):x(_x),y(_y){}
       int X(){return x;}
       int Y(){return y;}
        void mover();
        bool fuera();


    };
    void BALA::mover(){
    gotoxy(x,y);printf(" ");

    y--;
    gotoxy(x,y);printf("%c",94);
    }
    bool BALA::fuera(){
    if(y==4)return true;
    return false;
    }

    int main()
    {
    system ("COLOR 05");
    char soundfile[] = "gangnam_style_8bits.wav";

    cout<<PlaySound((LPCSTR)soundfile, NULL, SND_FILENAME | SND_ASYNC );
    system("cls");

     char y;

         gotoxy(18,1);printf("s");
         gotoxy(17,1);printf("s");
         gotoxy(16,1);printf("s");
         gotoxy(15,1);printf("s");
         gotoxy(14,1);printf("s");
         gotoxy(13,1);printf("s");
         gotoxy(12,1);printf("s");
         gotoxy(11,1);printf("s");
         gotoxy(18,2);printf("s");
         gotoxy(17,2);printf("s");
         gotoxy(16,2);printf("s");
         gotoxy(15,2);printf("s");
         gotoxy(14,2);printf("s");
         gotoxy(13,2);printf("s");
         gotoxy(12,2);printf("s");
         gotoxy(11,2);printf("s");

         gotoxy(11,3);printf("s");
         gotoxy(11,4);printf("s");
         gotoxy(11,5);printf("s");
         gotoxy(11,6);printf("s");
         gotoxy(12,3);printf("s");
         gotoxy(12,4);printf("s");
         gotoxy(12,5);printf("s");
         gotoxy(12,6);printf("s");

         gotoxy(18,5);printf("s");
         gotoxy(17,5);printf("s");
         gotoxy(16,5);printf("s");
         gotoxy(15,5);printf("s");
         gotoxy(14,5);printf("s");
         gotoxy(13,5);printf("s");
         gotoxy(18,6);printf("s");
         gotoxy(17,6);printf("s");
         gotoxy(16,6);printf("s");
         gotoxy(15,6);printf("s");
         gotoxy(14,6);printf("s");
         gotoxy(13,6);printf("s");

         gotoxy(18,7);printf("s");
         gotoxy(18,8);printf("s");
         gotoxy(18,9);printf("s");
         gotoxy(18,10);printf("s");
         gotoxy(17,7);printf("s");
         gotoxy(17,8);printf("s");
         gotoxy(17,9);printf("s");
         gotoxy(17,10);printf("s");

         gotoxy(16,9);printf("s");
         gotoxy(15,9);printf("s");
         gotoxy(14,9);printf("s");
         gotoxy(13,9);printf("s");
         gotoxy(12,9);printf("s");
         gotoxy(11,9);printf("s");

         gotoxy(16,10);printf("s");
         gotoxy(15,10);printf("s");
         gotoxy(14,10);printf("s");
         gotoxy(13,10);printf("s");
         gotoxy(12,10);printf("s");
         gotoxy(11,10);printf("s");

         gotoxy(29,1);printf("o");
         gotoxy(28,1);printf("o");
         gotoxy(27,1);printf("o");
         gotoxy(26,1);printf("o");
         gotoxy(25,1);printf("o");
         gotoxy(24,1);printf("o");
         gotoxy(23,1);printf("o");
         gotoxy(22,1);printf("o");
         gotoxy(29,2);printf("o");
         gotoxy(28,2);printf("o");
         gotoxy(27,2);printf("o");
         gotoxy(26,2);printf("o");
         gotoxy(25,2);printf("o");
         gotoxy(24,2);printf("o");
         gotoxy(23,2);printf("o");
         gotoxy(22,2);printf("o");

         gotoxy(22,3);printf("o");
         gotoxy(22,4);printf("o");
         gotoxy(22,5);printf("o");
         gotoxy(22,6);printf("o");
         gotoxy(22,7);printf("o");
         gotoxy(22,8);printf("o");
         gotoxy(22,9);printf("o");
         gotoxy(22,10);printf("o");
          gotoxy(23,3);printf("o");
         gotoxy(23,4);printf("o");
         gotoxy(23,5);printf("o");
         gotoxy(23,6);printf("o");
         gotoxy(23,7);printf("o");
         gotoxy(23,8);printf("o");
         gotoxy(23,9);printf("o");
         gotoxy(23,10);printf("o");

         gotoxy(24,10);printf("o");
         gotoxy(25,10);printf("o");
         gotoxy(26,10);printf("o");
         gotoxy(27,10);printf("o");
         gotoxy(28,10);printf("o");
         gotoxy(29,10);printf("o");
         gotoxy(24,9);printf("o");
         gotoxy(25,9);printf("o");
         gotoxy(26,9);printf("o");
         gotoxy(27,9);printf("o");
         gotoxy(28,9);printf("o");
         gotoxy(29,9);printf("o");

         gotoxy(28,8);printf("o");
         gotoxy(28,7);printf("o");
         gotoxy(28,6);printf("o");
         gotoxy(28,5);printf("o");
         gotoxy(28,4);printf("o");
         gotoxy(28,3);printf("o");
          gotoxy(29,8);printf("o");
         gotoxy(29,7);printf("o");
         gotoxy(29,6);printf("o");
         gotoxy(29,5);printf("o");
         gotoxy(29,4);printf("o");
         gotoxy(29,3);printf("o");

         gotoxy(33,1);printf("s");
         gotoxy(34,1);printf("s");
         gotoxy(35,1);printf("s");
         gotoxy(36,1);printf("s");
         gotoxy(37,1);printf("s");
         gotoxy(38,1);printf("s");
         gotoxy(39,1);printf("s");
         gotoxy(40,1);printf("s");
         gotoxy(33,2);printf("s");
         gotoxy(34,2);printf("s");
         gotoxy(35,2);printf("s");
         gotoxy(36,2);printf("s");
         gotoxy(37,2);printf("s");
         gotoxy(38,2);printf("s");
         gotoxy(39,2);printf("s");
         gotoxy(40,2);printf("s");

         gotoxy(33,3);printf("s");
         gotoxy(33,4);printf("s");
         gotoxy(33,5);printf("s");
         gotoxy(33,6);printf("s");
         gotoxy(34,3);printf("s");
         gotoxy(34,4);printf("s");
         gotoxy(34,5);printf("s");
         gotoxy(34,6);printf("s");

         gotoxy(40,5);printf("s");
         gotoxy(39,5);printf("s");
         gotoxy(38,5);printf("s");
         gotoxy(37,5);printf("s");
         gotoxy(36,5);printf("s");
         gotoxy(35,5);printf("s");
         gotoxy(40,6);printf("s");
         gotoxy(39,6);printf("s");
         gotoxy(38,6);printf("s");
         gotoxy(37,6);printf("s");
         gotoxy(36,6);printf("s");
         gotoxy(35,6);printf("s");

         gotoxy(40,7);printf("s");
         gotoxy(40,8);printf("s");
         gotoxy(40,9);printf("s");
         gotoxy(40,10);printf("s");
         gotoxy(40,7);printf("s");
         gotoxy(40,8);printf("s");
         gotoxy(40,9);printf("s");
         gotoxy(40,10);printf("s");

         gotoxy(39,7);printf("s");
         gotoxy(39,8);printf("s");
         gotoxy(39,9);printf("s");
         gotoxy(39,10);printf("s");
         gotoxy(39,7);printf("s");
         gotoxy(39,8);printf("s");
         gotoxy(39,9);printf("s");
         gotoxy(39,10);printf("s");

         gotoxy(38,9);printf("s");
         gotoxy(37,9);printf("s");
         gotoxy(36,9);printf("s");
         gotoxy(35,9);printf("s");
         gotoxy(34,9);printf("s");
         gotoxy(33,9);printf("s");

          gotoxy(38,10);printf("s");
         gotoxy(37,10);printf("s");
         gotoxy(36,10);printf("s");
         gotoxy(35,10);printf("s");
         gotoxy(34,10);printf("s");
         gotoxy(33,10);printf("s");

         gotoxy(53,1);printf("A");
         gotoxy(52,2);printf("A");
         gotoxy(51,2);printf("A");
         gotoxy(51,3);printf("A");
         gotoxy(50,3);printf("A");
         gotoxy(50,4);printf("A");
         gotoxy(49,4);printf("A");
         gotoxy(49,5);printf("A");
         gotoxy(48,5);printf("A");
         gotoxy(48,6);printf("A");
         gotoxy(47,6);printf("A");
         gotoxy(47,7);printf("A");
         gotoxy(46,7);printf("A");
         gotoxy(46,8);printf("A");
         gotoxy(45,8);printf("A");
         gotoxy(45,9);printf("A");
         gotoxy(44,9);printf("A");
         gotoxy(44,10);printf("A");
         gotoxy(43,10);printf("A");

         gotoxy(54,2);printf("A");
         gotoxy(55,2);printf("A");
         gotoxy(55,3);printf("A");
         gotoxy(56,3);printf("A");
         gotoxy(56,4);printf("A");
         gotoxy(57,4);printf("A");
         gotoxy(57,5);printf("A");
         gotoxy(58,5);printf("A");
         gotoxy(58,6);printf("A");
         gotoxy(59,6);printf("A");
         gotoxy(59,7);printf("A");
         gotoxy(60,7);printf("A");
         gotoxy(60,8);printf("A");
         gotoxy(61,8);printf("A");
         gotoxy(61,9);printf("A");
         gotoxy(62,9);printf("A");
         gotoxy(62,10);printf("A");
         gotoxy(63,10);printf("A");

         gotoxy(53,6);printf("A");
         gotoxy(52,6);printf("A");
         gotoxy(54,6);printf("A");
         gotoxy(55,6);printf("A");
         gotoxy(51,6);printf("A");
         gotoxy(50,6);printf("A");
         gotoxy(56,6);printf("A");

         gotoxy(24,15);printf("Derechos reservados S.A DE C.V \n");
         gotoxy(24,16);printf("SOSA Corporation S.A DE C.V");

                for(int m=0;m<1;m++){
         gotoxy(36,18);printf("*");
         Sleep(5);
         gotoxy(36,18);printf(" ");
         Sleep(5);
         gotoxy(36,19);printf("*");
          Sleep(5);
         gotoxy(36,19);printf(" ");
         Sleep(5);
         gotoxy(37,19);printf("*");
          Sleep(5);
         gotoxy(37,19);printf(" ");
         Sleep(5);
          gotoxy(35,19);printf("*");
           Sleep(5);
         gotoxy(35,19);printf(" ");
         Sleep(5);
         gotoxy(36,20);printf("*");
          Sleep(5);
         gotoxy(36,20);printf(" ");
         Sleep(5);
         gotoxy(37,20);printf("*");
          Sleep(5);
         gotoxy(37,20);printf(" ");
         Sleep(5);
         gotoxy(34,20);printf("*");
          Sleep(5);
         gotoxy(34,20);printf(" ");
         Sleep(5);
          gotoxy(35,20);printf("*");
           Sleep(5);
         gotoxy(35,20);printf(" ");
         Sleep(5);
          gotoxy(38,20);printf("*");
           Sleep(5);
         gotoxy(38,20);printf(" ");
         Sleep(5);
          gotoxy(36,21);printf("*");
           Sleep(5);
         gotoxy(36,21);printf(" ");
         Sleep(5);
         gotoxy(37,21);printf("*");
          Sleep(5);
         gotoxy(37,21);printf(" ");
         Sleep(5);
          gotoxy(35,21);printf("*");
           Sleep(5);
         gotoxy(35,21);printf(" ");
         Sleep(5);
          gotoxy(36,22);printf("*");
           Sleep(5);
         gotoxy(36,22);printf(" ");
         Sleep(5);
         }
         gotoxy(36,18);printf("*");
         gotoxy(36,19);printf("*");
         gotoxy(37,19);printf("*");
          gotoxy(35,19);printf("*");
         gotoxy(36,20);printf("E");
         gotoxy(37,20);printf("T");
         gotoxy(34,20);printf("C");
          gotoxy(35,20);printf("H");
          gotoxy(38,20);printf("O");
          gotoxy(36,21);printf("*");
         gotoxy(37,21);printf("*");
          gotoxy(35,21);printf("*");
          gotoxy(36,22);printf("*");

         gotoxy(64,33);printf("Presione enter ");
         scanf("%c",&y);

         system("cls");
        for(int s=1;s>0;s--){
                char soundfile[] = "sonido_de_un_jet.wav";

    cout<<PlaySound((LPCSTR)soundfile, NULL, SND_FILENAME | SND_ASYNC );
    system("cls");
        OcultarCursor();

        gotoxy(28,15);printf("SOSA Corporation S.A DE C.V Presenta ");
        Sleep(3000);
        gotoxy(28,15);printf("                                     ");
        Sleep(1500);

        gotoxy(18,1);printf("s");
         gotoxy(17,1);printf("s");
         gotoxy(16,1);printf("s");
         gotoxy(15,1);printf("s");
         gotoxy(14,1);printf("s");
         gotoxy(13,1);printf("s");
         gotoxy(12,1);printf("s");
         gotoxy(11,1);printf("s");
         gotoxy(18,2);printf("s");
         gotoxy(17,2);printf("s");
         gotoxy(16,2);printf("s");
         gotoxy(15,2);printf("s");
         gotoxy(14,2);printf("s");
         gotoxy(13,2);printf("s");
         gotoxy(12,2);printf("s");
         gotoxy(11,2);printf("s");

         gotoxy(11,3);printf("s");
         gotoxy(11,4);printf("s");
         gotoxy(11,5);printf("s");
         gotoxy(11,6);printf("s");
         gotoxy(12,3);printf("s");
         gotoxy(12,4);printf("s");
         gotoxy(12,5);printf("s");
         gotoxy(12,6);printf("s");

         gotoxy(18,5);printf("s");
         gotoxy(17,5);printf("s");
         gotoxy(16,5);printf("s");
         gotoxy(15,5);printf("s");
         gotoxy(14,5);printf("s");
         gotoxy(13,5);printf("s");
         gotoxy(18,6);printf("s");
         gotoxy(17,6);printf("s");
         gotoxy(16,6);printf("s");
         gotoxy(15,6);printf("s");
         gotoxy(14,6);printf("s");
         gotoxy(13,6);printf("s");

         gotoxy(18,7);printf("s");
         gotoxy(18,8);printf("s");
         gotoxy(18,9);printf("s");
         gotoxy(18,10);printf("s");
         gotoxy(17,7);printf("s");
         gotoxy(17,8);printf("s");
         gotoxy(17,9);printf("s");
         gotoxy(17,10);printf("s");

         gotoxy(16,9);printf("s");
         gotoxy(15,9);printf("s");
         gotoxy(14,9);printf("s");
         gotoxy(13,9);printf("s");
         gotoxy(12,9);printf("s");
         gotoxy(11,9);printf("s");

         gotoxy(16,10);printf("s");
         gotoxy(15,10);printf("s");
         gotoxy(14,10);printf("s");
         gotoxy(13,10);printf("s");
         gotoxy(12,10);printf("s");
         gotoxy(11,10);printf("s");
    Sleep(1000);
         gotoxy(29,1);printf("o");
         gotoxy(28,1);printf("o");
         gotoxy(27,1);printf("o");
         gotoxy(26,1);printf("o");
         gotoxy(25,1);printf("o");
         gotoxy(24,1);printf("o");
         gotoxy(23,1);printf("o");
         gotoxy(22,1);printf("o");
         gotoxy(29,2);printf("o");
         gotoxy(28,2);printf("o");
         gotoxy(27,2);printf("o");
         gotoxy(26,2);printf("o");
         gotoxy(25,2);printf("o");
         gotoxy(24,2);printf("o");
         gotoxy(23,2);printf("o");
         gotoxy(22,2);printf("o");

         gotoxy(22,3);printf("o");
         gotoxy(22,4);printf("o");
         gotoxy(22,5);printf("o");
         gotoxy(22,6);printf("o");
         gotoxy(22,7);printf("o");
         gotoxy(22,8);printf("o");
         gotoxy(22,9);printf("o");
         gotoxy(22,10);printf("o");
          gotoxy(23,3);printf("o");
         gotoxy(23,4);printf("o");
         gotoxy(23,5);printf("o");
         gotoxy(23,6);printf("o");
         gotoxy(23,7);printf("o");
         gotoxy(23,8);printf("o");
         gotoxy(23,9);printf("o");
         gotoxy(23,10);printf("o");

         gotoxy(24,10);printf("o");
         gotoxy(25,10);printf("o");
         gotoxy(26,10);printf("o");
         gotoxy(27,10);printf("o");
         gotoxy(28,10);printf("o");
         gotoxy(29,10);printf("o");
         gotoxy(24,9);printf("o");
         gotoxy(25,9);printf("o");
         gotoxy(26,9);printf("o");
         gotoxy(27,9);printf("o");
         gotoxy(28,9);printf("o");
         gotoxy(29,9);printf("o");

         gotoxy(28,8);printf("o");
         gotoxy(28,7);printf("o");
         gotoxy(28,6);printf("o");
         gotoxy(28,5);printf("o");
         gotoxy(28,4);printf("o");
         gotoxy(28,3);printf("o");
          gotoxy(29,8);printf("o");
         gotoxy(29,7);printf("o");
         gotoxy(29,6);printf("o");
         gotoxy(29,5);printf("o");
         gotoxy(29,4);printf("o");
         gotoxy(29,3);printf("o");
    Sleep(1000);
         gotoxy(33,1);printf("s");
         gotoxy(34,1);printf("s");
         gotoxy(35,1);printf("s");
         gotoxy(36,1);printf("s");
         gotoxy(37,1);printf("s");
         gotoxy(38,1);printf("s");
         gotoxy(39,1);printf("s");
         gotoxy(40,1);printf("s");
         gotoxy(33,2);printf("s");
         gotoxy(34,2);printf("s");
         gotoxy(35,2);printf("s");
         gotoxy(36,2);printf("s");
         gotoxy(37,2);printf("s");
         gotoxy(38,2);printf("s");
         gotoxy(39,2);printf("s");
         gotoxy(40,2);printf("s");

         gotoxy(33,3);printf("s");
         gotoxy(33,4);printf("s");
         gotoxy(33,5);printf("s");
         gotoxy(33,6);printf("s");
         gotoxy(34,3);printf("s");
         gotoxy(34,4);printf("s");
         gotoxy(34,5);printf("s");
         gotoxy(34,6);printf("s");

         gotoxy(40,5);printf("s");
         gotoxy(39,5);printf("s");
         gotoxy(38,5);printf("s");
         gotoxy(37,5);printf("s");
         gotoxy(36,5);printf("s");
         gotoxy(35,5);printf("s");
         gotoxy(40,6);printf("s");
         gotoxy(39,6);printf("s");
         gotoxy(38,6);printf("s");
         gotoxy(37,6);printf("s");
         gotoxy(36,6);printf("s");
         gotoxy(35,6);printf("s");

         gotoxy(40,7);printf("s");
         gotoxy(40,8);printf("s");
         gotoxy(40,9);printf("s");
         gotoxy(40,10);printf("s");
         gotoxy(40,7);printf("s");
         gotoxy(40,8);printf("s");
         gotoxy(40,9);printf("s");
         gotoxy(40,10);printf("s");

         gotoxy(39,7);printf("s");
         gotoxy(39,8);printf("s");
         gotoxy(39,9);printf("s");
         gotoxy(39,10);printf("s");
         gotoxy(39,7);printf("s");
         gotoxy(39,8);printf("s");
         gotoxy(39,9);printf("s");
         gotoxy(39,10);printf("s");

         gotoxy(38,9);printf("s");
         gotoxy(37,9);printf("s");
         gotoxy(36,9);printf("s");
         gotoxy(35,9);printf("s");
         gotoxy(34,9);printf("s");
         gotoxy(33,9);printf("s");

          gotoxy(38,10);printf("s");
         gotoxy(37,10);printf("s");
         gotoxy(36,10);printf("s");
         gotoxy(35,10);printf("s");
         gotoxy(34,10);printf("s");
         gotoxy(33,10);printf("s");
    Sleep(1000);
         gotoxy(53,1);printf("A");
         gotoxy(52,2);printf("A");
         gotoxy(51,2);printf("A");
         gotoxy(51,3);printf("A");
         gotoxy(50,3);printf("A");
         gotoxy(50,4);printf("A");
         gotoxy(49,4);printf("A");
         gotoxy(49,5);printf("A");
         gotoxy(48,5);printf("A");
         gotoxy(48,6);printf("A");
         gotoxy(47,6);printf("A");
         gotoxy(47,7);printf("A");
         gotoxy(46,7);printf("A");
         gotoxy(46,8);printf("A");
         gotoxy(45,8);printf("A");
         gotoxy(45,9);printf("A");
         gotoxy(44,9);printf("A");
         gotoxy(44,10);printf("A");
         gotoxy(43,10);printf("A");

         gotoxy(54,2);printf("A");
         gotoxy(55,2);printf("A");
         gotoxy(55,3);printf("A");
         gotoxy(56,3);printf("A");
         gotoxy(56,4);printf("A");
         gotoxy(57,4);printf("A");
         gotoxy(57,5);printf("A");
         gotoxy(58,5);printf("A");
         gotoxy(58,6);printf("A");
         gotoxy(59,6);printf("A");
         gotoxy(59,7);printf("A");
         gotoxy(60,7);printf("A");
         gotoxy(60,8);printf("A");
         gotoxy(61,8);printf("A");
         gotoxy(61,9);printf("A");
         gotoxy(62,9);printf("A");
         gotoxy(62,10);printf("A");
         gotoxy(63,10);printf("A");

         gotoxy(53,6);printf("A");
         gotoxy(52,6);printf("A");
         gotoxy(54,6);printf("A");
         gotoxy(55,6);printf("A");
         gotoxy(51,6);printf("A");
         gotoxy(50,6);printf("A");
         gotoxy(56,6);printf("A");
         Sleep(1000);
         gotoxy(1,1);printf("                                                                                                              ");
         gotoxy(1,2);printf("                                                                                                              ");
         gotoxy(1,3);printf("                                                                                                              ");
         gotoxy(1,4);printf("                                                                                                              ");
         gotoxy(1,5);printf("                                                                                                              ");
         gotoxy(1,6);printf("                                                                                                              ");
         gotoxy(1,7);printf("                                                                                                              ");
         gotoxy(1,8);printf("                                                                                                              ");
         gotoxy(1,9);printf("                                                                                                              ");
         gotoxy(1,10);printf("                                                                                                              ");
    Sleep(1000);
    gotoxy(18,1);printf("s");
         gotoxy(17,1);printf("s");
         gotoxy(16,1);printf("s");
         gotoxy(15,1);printf("s");
         gotoxy(14,1);printf("s");
         gotoxy(13,1);printf("s");
         gotoxy(12,1);printf("s");
         gotoxy(11,1);printf("s");
         gotoxy(18,2);printf("s");
         gotoxy(17,2);printf("s");
         gotoxy(16,2);printf("s");
         gotoxy(15,2);printf("s");
         gotoxy(14,2);printf("s");
         gotoxy(13,2);printf("s");
         gotoxy(12,2);printf("s");
         gotoxy(11,2);printf("s");

         gotoxy(11,3);printf("s");
         gotoxy(11,4);printf("s");
         gotoxy(11,5);printf("s");
         gotoxy(11,6);printf("s");
         gotoxy(12,3);printf("s");
         gotoxy(12,4);printf("s");
         gotoxy(12,5);printf("s");
         gotoxy(12,6);printf("s");

         gotoxy(18,5);printf("s");
         gotoxy(17,5);printf("s");
         gotoxy(16,5);printf("s");
         gotoxy(15,5);printf("s");
         gotoxy(14,5);printf("s");
         gotoxy(13,5);printf("s");
         gotoxy(18,6);printf("s");
         gotoxy(17,6);printf("s");
         gotoxy(16,6);printf("s");
         gotoxy(15,6);printf("s");
         gotoxy(14,6);printf("s");
         gotoxy(13,6);printf("s");

         gotoxy(18,7);printf("s");
         gotoxy(18,8);printf("s");
         gotoxy(18,9);printf("s");
         gotoxy(18,10);printf("s");
         gotoxy(17,7);printf("s");
         gotoxy(17,8);printf("s");
         gotoxy(17,9);printf("s");
         gotoxy(17,10);printf("s");

         gotoxy(16,9);printf("s");
         gotoxy(15,9);printf("s");
         gotoxy(14,9);printf("s");
         gotoxy(13,9);printf("s");
         gotoxy(12,9);printf("s");
         gotoxy(11,9);printf("s");

         gotoxy(16,10);printf("s");
         gotoxy(15,10);printf("s");
         gotoxy(14,10);printf("s");
         gotoxy(13,10);printf("s");
         gotoxy(12,10);printf("s");
         gotoxy(11,10);printf("s");

         gotoxy(29,1);printf("o");
         gotoxy(28,1);printf("o");
         gotoxy(27,1);printf("o");
         gotoxy(26,1);printf("o");
         gotoxy(25,1);printf("o");
         gotoxy(24,1);printf("o");
         gotoxy(23,1);printf("o");
         gotoxy(22,1);printf("o");
         gotoxy(29,2);printf("o");
         gotoxy(28,2);printf("o");
         gotoxy(27,2);printf("o");
         gotoxy(26,2);printf("o");
         gotoxy(25,2);printf("o");
         gotoxy(24,2);printf("o");
         gotoxy(23,2);printf("o");
         gotoxy(22,2);printf("o");

         gotoxy(22,3);printf("o");
         gotoxy(22,4);printf("o");
         gotoxy(22,5);printf("o");
         gotoxy(22,6);printf("o");
         gotoxy(22,7);printf("o");
         gotoxy(22,8);printf("o");
         gotoxy(22,9);printf("o");
         gotoxy(22,10);printf("o");
          gotoxy(23,3);printf("o");
         gotoxy(23,4);printf("o");
         gotoxy(23,5);printf("o");
         gotoxy(23,6);printf("o");
         gotoxy(23,7);printf("o");
         gotoxy(23,8);printf("o");
         gotoxy(23,9);printf("o");
         gotoxy(23,10);printf("o");

         gotoxy(24,10);printf("o");
         gotoxy(25,10);printf("o");
         gotoxy(26,10);printf("o");
         gotoxy(27,10);printf("o");
         gotoxy(28,10);printf("o");
         gotoxy(29,10);printf("o");
         gotoxy(24,9);printf("o");
         gotoxy(25,9);printf("o");
         gotoxy(26,9);printf("o");
         gotoxy(27,9);printf("o");
         gotoxy(28,9);printf("o");
         gotoxy(29,9);printf("o");

         gotoxy(28,8);printf("o");
         gotoxy(28,7);printf("o");
         gotoxy(28,6);printf("o");
         gotoxy(28,5);printf("o");
         gotoxy(28,4);printf("o");
         gotoxy(28,3);printf("o");
          gotoxy(29,8);printf("o");
         gotoxy(29,7);printf("o");
         gotoxy(29,6);printf("o");
         gotoxy(29,5);printf("o");
         gotoxy(29,4);printf("o");
         gotoxy(29,3);printf("o");

         gotoxy(33,1);printf("s");
         gotoxy(34,1);printf("s");
         gotoxy(35,1);printf("s");
         gotoxy(36,1);printf("s");
         gotoxy(37,1);printf("s");
         gotoxy(38,1);printf("s");
         gotoxy(39,1);printf("s");
         gotoxy(40,1);printf("s");
         gotoxy(33,2);printf("s");
         gotoxy(34,2);printf("s");
         gotoxy(35,2);printf("s");
         gotoxy(36,2);printf("s");
         gotoxy(37,2);printf("s");
         gotoxy(38,2);printf("s");
         gotoxy(39,2);printf("s");
         gotoxy(40,2);printf("s");

         gotoxy(33,3);printf("s");
         gotoxy(33,4);printf("s");
         gotoxy(33,5);printf("s");
         gotoxy(33,6);printf("s");
         gotoxy(34,3);printf("s");
         gotoxy(34,4);printf("s");
         gotoxy(34,5);printf("s");
         gotoxy(34,6);printf("s");

         gotoxy(40,5);printf("s");
         gotoxy(39,5);printf("s");
         gotoxy(38,5);printf("s");
         gotoxy(37,5);printf("s");
         gotoxy(36,5);printf("s");
         gotoxy(35,5);printf("s");
         gotoxy(40,6);printf("s");
         gotoxy(39,6);printf("s");
         gotoxy(38,6);printf("s");
         gotoxy(37,6);printf("s");
         gotoxy(36,6);printf("s");
         gotoxy(35,6);printf("s");

         gotoxy(40,7);printf("s");
         gotoxy(40,8);printf("s");
         gotoxy(40,9);printf("s");
         gotoxy(40,10);printf("s");
         gotoxy(40,7);printf("s");
         gotoxy(40,8);printf("s");
         gotoxy(40,9);printf("s");
         gotoxy(40,10);printf("s");

         gotoxy(39,7);printf("s");
         gotoxy(39,8);printf("s");
         gotoxy(39,9);printf("s");
         gotoxy(39,10);printf("s");
         gotoxy(39,7);printf("s");
         gotoxy(39,8);printf("s");
         gotoxy(39,9);printf("s");
         gotoxy(39,10);printf("s");

         gotoxy(38,9);printf("s");
         gotoxy(37,9);printf("s");
         gotoxy(36,9);printf("s");
         gotoxy(35,9);printf("s");
         gotoxy(34,9);printf("s");
         gotoxy(33,9);printf("s");

          gotoxy(38,10);printf("s");
         gotoxy(37,10);printf("s");
         gotoxy(36,10);printf("s");
         gotoxy(35,10);printf("s");
         gotoxy(34,10);printf("s");
         gotoxy(33,10);printf("s");

         gotoxy(53,1);printf("A");
         gotoxy(52,2);printf("A");
         gotoxy(51,2);printf("A");
         gotoxy(51,3);printf("A");
         gotoxy(50,3);printf("A");
         gotoxy(50,4);printf("A");
         gotoxy(49,4);printf("A");
         gotoxy(49,5);printf("A");
         gotoxy(48,5);printf("A");
         gotoxy(48,6);printf("A");
         gotoxy(47,6);printf("A");
         gotoxy(47,7);printf("A");
         gotoxy(46,7);printf("A");
         gotoxy(46,8);printf("A");
         gotoxy(45,8);printf("A");
         gotoxy(45,9);printf("A");
         gotoxy(44,9);printf("A");
         gotoxy(44,10);printf("A");
         gotoxy(43,10);printf("A");

         gotoxy(54,2);printf("A");
         gotoxy(55,2);printf("A");
         gotoxy(55,3);printf("A");
         gotoxy(56,3);printf("A");
         gotoxy(56,4);printf("A");
         gotoxy(57,4);printf("A");
         gotoxy(57,5);printf("A");
         gotoxy(58,5);printf("A");
         gotoxy(58,6);printf("A");
         gotoxy(59,6);printf("A");
         gotoxy(59,7);printf("A");
         gotoxy(60,7);printf("A");
         gotoxy(60,8);printf("A");
         gotoxy(61,8);printf("A");
         gotoxy(61,9);printf("A");
         gotoxy(62,9);printf("A");
         gotoxy(62,10);printf("A");
         gotoxy(63,10);printf("A");

         gotoxy(53,6);printf("A");
         gotoxy(52,6);printf("A");
         gotoxy(54,6);printf("A");
         gotoxy(55,6);printf("A");
         gotoxy(51,6);printf("A");
         gotoxy(50,6);printf("A");
         gotoxy(56,6);printf("A");
            }
        for(int s=3;s>0;s--){
         gotoxy(68,33);printf("Cargando.");
        Sleep(500);
        gotoxy(68,33);printf("Cargando .");
        Sleep(500);
        gotoxy(68,33);printf("Cargando  .");
        Sleep(500);
        gotoxy(68,33);printf("           ");
        Sleep(500);
    }
     while(y!='n')
        {
           char soundfile[] = "im_blue.wav";

    cout<<PlaySound((LPCSTR)soundfile, NULL, SND_FILENAME | SND_ASYNC );
      system("cls");
    OcultarCursor();
    pintar_limites();
        NAVE N(37,30,3,3);
         N.pintar();
        N.pintar_corazones();
        list<AST*>A;
        list<AST*>::iterator itA;

        for(int i=0;i<5;i++){
            A.push_back(new AST(rand()%75+3,rand()%5+4));
            Sleep(100);
        }

        list<BALA*>B;
        list<BALA*>::iterator it;
        bool game_over=false;
        int puntos=0;
        int nivel=1;
        int combo=0;
        while(!game_over){
                gotoxy(3,2);printf("Puntos %d",puntos);
                gotoxy(26,2);printf("NIVEL %d",nivel);
                if(kbhit()){

                   char tecla=getch();
                   if(tecla==32||tecla=='a')
                    B.push_back(new BALA(N.X()+2,N.Y()-1));
                    if(combo==1&&tecla=='x'){
                    B.push_back(new BALA(N.X()+2,N.Y()-1));
                     B.push_back(new BALA(N.X()+3,N.Y()-1));
                     B.push_back(new BALA(N.X()+1,N.Y()-1));
                }

                   }
                   for(it=B.begin();it!=B.end();it++)
                    {
                       (*it)->mover();
                       if((*it)->fuera()){
                        gotoxy((*it)->X(),(*it)->Y());printf(" ");
                        delete(*it);
                        it=B.erase(it);
                       }
                   }

                for(itA=A.begin();itA!=A.end();itA++){
                    (*itA)->mover();
                    (*itA)->choque(N);

                }
                for(itA=A.begin();itA!=A.end();itA++){
                    for(it=B.begin();it!=B.end();it++){
                      if((*itA)->X()==(*it)->X()&&((*itA)->Y()+1==(*it)->Y()||(*itA)->Y()==(*it)->Y()))
                         {
                        gotoxy((*it)->X(),(*it)->Y()); printf(" ");
                        delete(*it);
                        it=B.erase(it);

                       A.push_back(new AST(rand()%74+3,4));
                       gotoxy((*itA)->X(),(*itA)->Y()); printf(" ");
                       delete(*itA);
                       itA=A.erase(itA);

                       puntos+=2;

                        if(puntos==20){
                        system("cls");
                        system("COLOR F");
                        }
                        if(puntos==50){
                        pintar_limites();
                        system("COLOR F4");
                        }
                        if(puntos==100){
                        system("cls");
                        system("COLOR F0");
                        }
                        if(puntos==150){
                        pintar_limites();
                        system("COLOR 60");
                        }
                        if(puntos==200){
                        system("cls");
                        system("COLOR 71");
                        }
                        if(puntos==250){
                        pintar_limites();
                        system("COLOR 14");
                        }
                        if(puntos==300){
                        system("cls");
                        system("COLOR 41");
                        }
                        if(puntos==350){
                        pintar_limites();
                        system("COLOR 71");
                        }
                        if(puntos>15){
                        combo=1;
                        gotoxy(14,2);printf("Combo %c %c %c",206,206,206);
                        }
                         if(puntos>30){
                        combo=0;
                        gotoxy(14,2);printf("              ");
                        }
                        if(puntos>100){
                        combo=1;
                        gotoxy(14,2);printf("Combo %c %c %c",206,206,206);
                        }
                        if(puntos>120){
                        combo=0;
                        gotoxy(14,2);printf("              ");
                        }
                        if(puntos>160){
                        combo=1;
                         gotoxy(14,2);printf("Combo %c %c %c",206,206,206);
                        }
                        if(puntos>190){
                        combo=0;
                        gotoxy(14,2);printf("              ");
                        }
                        if(puntos>250){
                        combo=1;
                        gotoxy(14,2);printf("Combo %c %c %c",206,206,206);
                        }
                        if(puntos>270){
                        combo=0;
                        gotoxy(14,2);printf("              ");
                        }
                        if(puntos>310){
                        combo=1;
                         gotoxy(14,2);printf("Combo %c %c %c",206,206,206);
                        }
                        if(puntos>330){
                        combo=0;
                        gotoxy(14,2);printf("              ");
                        }


                        if(puntos>=100){
                        nivel=2;
                        }
                       if(puntos>=150){
                        nivel=3;
                       }
                       if(puntos>=200){
                        nivel=4;
                       }
                       if(puntos>=250){
                        nivel=5;
                       }
                       if(puntos>=300){
                        nivel=6;
                       }
                       if(puntos>350){
                        nivel=7;
                       }
                      }

                    }

                }
                if(N.VID()==0) game_over=true;
                N.morir();
            N.mover();

    if(nivel==1){
               Sleep(30);

        }
    if(nivel==2){
               Sleep(28);
               gotoxy(36,2);printf("Estas cabron");
        }
    if(nivel==3){
               Sleep(26);
               gotoxy(36,2);printf("mamaste     ");
        }
    if(nivel==4){
        Sleep(24);
              gotoxy(36,2);printf("eres loco    ");
    }
    if(nivel==5){
               Sleep(16);
             gotoxy(36,2);printf("no te aburres?");
        }
    if(nivel==6){
               Sleep(22);
            gotoxy(36,2);printf("ya dejalo weon");
        }
    if(nivel>=7){
           gotoxy(36,2);printf("Felicidades     ");
        Sleep(20);
        }
    }
            N.borrar();
            system("cls");

            for(int l=2;l>1;l--){
                   char soundfile[] = "metal_gear_solid_exclamacion.wav";

    cout<<PlaySound((LPCSTR)soundfile, NULL, SND_FILENAME | SND_ASYNC );
      system("cls");
      Sleep(100);
         gotoxy(30,15);printf("Game over");
            Sleep(1000);
            gotoxy(30,15);printf("         ");
            Sleep(500);
            nivel=0;
          }
           for(int l=2;l>1;l--){
                 char soundfile[] = "lol.wav";

    cout<<PlaySound((LPCSTR)soundfile, NULL, SND_FILENAME | SND_ASYNC );
      system("cls");
      Sleep(100);
         gotoxy(30,15);printf("Game over");
            Sleep(1000);
            gotoxy(30,15);printf("         ");
            Sleep(500);
            nivel=0;
          }
          gotoxy(36,18);printf("*");
         gotoxy(36,19);printf("*");
         gotoxy(37,19);printf("*");
          gotoxy(35,19);printf("*");
         gotoxy(36,20);printf("E");
         gotoxy(37,20);printf("T");
         gotoxy(34,20);printf("C");
          gotoxy(35,20);printf("H");
          gotoxy(38,20);printf("O");
          gotoxy(36,21);printf("*");
         gotoxy(37,21);printf("*");
          gotoxy(35,21);printf("*");
          gotoxy(36,22);printf("*");
            gotoxy(30,15);printf("Game over");
            gotoxy(26,16);printf("Thanks for playing");
            gotoxy(24,17);printf("quieres jugar de nuevo?n=no: ");
            scanf("%c",&y);
         system("cls");
        }
    return 0;
    }

