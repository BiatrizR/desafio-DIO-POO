import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Code GIRLS ");
        curso1.setDescricao("Descrição: Bootcamp Santander Code Girls ");
        curso1.setProfessores("Ministrado por:Camila Cavalcante, Juliana Mascarenhas e Thiago Leite ");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("Descrição: Curso de Java disponibilizado pela plataforma DIO.me");
        curso2.setProfessores("Ministrado por:Camila Cavalcante, Juliana Mascarenhas e Thiago Leite ");
        curso2.setCargaHoraria(6);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

         //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Santander Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Aluno devBeatriz = new Aluno();
        devBeatriz.setNome("Beatriz ");
        devBeatriz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos em que Beatriz está inscrita:" + devBeatriz.getConteudosInscritos());
        devBeatriz.progredir();
        devBeatriz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos em que Beatriz está inscrita: " + devBeatriz.getConteudosInscritos());
        System.out.println("Conteúdos em que Beatriz CONCLUIU:" + devBeatriz.getConteudosConcluidos());
        System.out.println("XP:" + devBeatriz.calcularTotalXp());

        System.out.println("-------");
        System.out.println("-------");

        Aluno devMariaJosefina = new Aluno();
        devMariaJosefina.setNome("Olá Maria Antonieta");
        devMariaJosefina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria J:" + devMariaJosefina.getConteudosInscritos());
        devMariaJosefina.progredir();
        devMariaJosefina.progredir();
        devMariaJosefina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Maria J:" + devMariaJosefina.getConteudosInscritos());
        System.out.println("Conteúdos ConcluidosMaria J:" + devMariaJosefina.getConteudosConcluidos());
        System.out.println("XP:" + devMariaJosefina.calcularTotalXp());
    }
}
