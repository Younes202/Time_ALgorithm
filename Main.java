import java.util.Scanner;

class Main {

  public static boolean isNumeric(String s) { // Fonction qui vérifier est ce que la valeur entrée nombre ou non
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int foecnumeric(String hms) {
    return Integer.parseInt(hms);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int h_int,m_int,sec_int;
    String h_str,m_str,sec_str;
    boolean testh = true,testm=true,tests=true;
    // Gestion d'exception concernant l'heure {1- no Stirng no value > 24}
    do{
    do{ 
      System.out.println(" *--------- Entrer l'heure ----------* ");
      h_str = input.nextLine();
      testh=isNumeric(h_str);
      
    }while(testh!=true);
            h_int=foecnumeric(h_str);

    }while(h_int>24);
         // Gestion d'exception concernant la munite {1- no Stirng no value > 60}

    do{
    do{ 
        System.out.println(" *--------- Entrer la minute ----------* ");
        m_str = input.nextLine();
        testm=isNumeric(m_str);
      
    }while(testm!=true);
            m_int=foecnumeric(m_str);

    }while(m_int>60);
   
       // Gestion d'exception concernant la seconde {1- no Stirng no value > 60}

    
    do{
    do{ 
         System.out.println(" *--------- Entrer la seconde ----------* ");
         sec_str = input.nextLine();
        testm=isNumeric(sec_str);
      
    }while(testm!=true);
            sec_int=foecnumeric(sec_str);

    }while(sec_int>60);
           // Incrémenter avec 1 seconde 

      sec_int++;
               // Tester et ajouter .

    if (sec_int > 60){
            sec_int=00;
            m_int++;
    }
    if (m_int > 60){
            m_int=00;
            h_int++;
    }
    if (h_int > 24){
            h_int=00;
            m_int=00;
            sec_int=00;
    }
            System.out.printf(" *--------- H:M:S : %d:%d:%d  ----------*",h_int,m_int,sec_int);




  }
}
