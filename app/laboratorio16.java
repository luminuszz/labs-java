package app;

//dimport java.util.GregorianCalendar;
import java.util.Scanner;
//OBS: Professor por conta da extensão da classe tive que separa-la em metodos,
public class laboratorio16 {
  int anoAtual;
  int mesAtual;
  int diaAtual;

  public laboratorio16() {
    // Edite o constructor para o dia atual ou use o Calendar do java se preferir
    anoAtual = 2020;
    mesAtual = 3;
    diaAtual = 27;

 
    
  }
  
  
  public static void main(String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    int dia, mes, ano;

    System.out.println("Informe sua data nascimento: dia , mês e ano em numeros respectivamente");
    dia = learn.nextInt();
    mes = learn.nextInt();
    ano = learn.nextInt();
    learn.close();

    setIdade(dia,mes,ano, setCalendarDia(mes, ano));

  }

  private static int setbissexto(int ano) {
    if (ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)) {
      return 29;
    } else {
      return 28;

    }
  }

  public static int setCalendarDia(int mes, int ano) {
    int diaMes = 0;
    switch (mes) {
      case 2:
        diaMes = setbissexto(ano);
        break;
      case 11:
      case 4:
      case 6:
      case 9:
        diaMes = 30;

      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        diaMes = 31;
        break;
      default:
        System.out.println("Mês inválido");
        break;

    }
    return diaMes;

  }

  private static int setMes(int mes, int mesAtual ){
   
    if(mes > mesAtual){
      int resolve = ((12 - mes) + mesAtual );
      return resolve;
    }
    else {
     int resolve = (mesAtual - mes);
     return resolve;
    }
   
  }
  public static int setAno(int ano, int anoAtual, int mes, int mesAtual,int dia, int diaAtual){
    if(mes > mesAtual || mes == mesAtual && diaAtual >dia ){
      int resolve =  ((anoAtual - ano) -1  );
      return resolve;
    }
 
    else{
      int resolve = ((anoAtual - ano) );
      return resolve;
    }

    
  }

  private static void setIdade(int dia , int mes , int ano , int diaMes) {
     laboratorio16 defaultDate = new laboratorio16();
    
    int resolveAno = setAno(ano, defaultDate.anoAtual, mes, defaultDate.mesAtual, dia, defaultDate.diaAtual);
    int resolveMes = setMes(mes, defaultDate.mesAtual);
    int resolveDia = (defaultDate.diaAtual - dia);
    

     System.out.println("Você tem " + resolveAno + " ano(s), " + resolveMes + " mês(s) e " + resolveDia + " dia(s))");
    

  }
}