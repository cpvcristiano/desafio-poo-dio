import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo( "Curso Java" );
        curso1.setDescricao( "Descrição do curso de Java " );
        curso1.setCargaHorario( 8 );

        Curso curso2 = new Curso();
        curso2.setTitulo( "Curso Python " );
        curso2.setDescricao( "Descrição do curso de Python " );
        curso2.setCargaHorario( 9 );

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo( "Mentoria Java" );
        mentoria.setDescricao( "Descrição do Curso De Java" );
        mentoria.setData( LocalDate.now() );


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
