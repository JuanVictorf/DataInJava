package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramTwo {

	public static void main(String[] args) {
		
		// OBJETO DO TIPO SIMPLEDATEFORMAT COM NOME DE SDF
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		System.out.println("----------------------");
		
		// CRIANDO OBJETO CALENDAR 
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); // setando o tempo PARA O OBJETO do tipo CAL
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int minutes = cal.get(Calendar.MINUTE); // PEGANDO OS MINUTOS 
		int mouth = 1 + cal.get(Calendar.MONTH); // PEGANDO O MÊS DO OBJETO TIPO D
		int years = cal.get(Calendar.YEAR); // PEGANDO O ANO
		
		
		System.out.println("Dia do registro d: " + day);
		System.out.println("Minutos do registro d: " + minutes);
		System.out.println("Mês do registro d: " + mouth);
		System.out.println("Ano do registro d: " + years);
		
		
	}

}
