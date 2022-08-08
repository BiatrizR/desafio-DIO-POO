import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(6);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
