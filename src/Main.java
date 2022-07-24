import br.com.dio.desafio.dominio.*;

import javax.swing.event.DocumentEvent;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("Descrição cruso Java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso JS");
       curso2.setDescricao("Descrição cruso JS");
       curso2.setCargaHoraria(4);

       Conteudo conteudo = new Curso();

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Mentoria de Java");
       mentoria.setDescricao("Descrição mentoria de Java");
       mentoria.setData(LocalDate.now());

      /* System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devNathalia = new Dev();
       devNathalia.setNome("Nathalia");
       devNathalia.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Camila: " + devNathalia.getConteudosIncritos());
       devNathalia.progredir();
       devNathalia.progredir();
       System.out.println("Conteúdos Inscritos Camila: " + devNathalia.getConteudosIncritos());
       System.out.println("Conteúdos Concluidos Camila: " + devNathalia.getConteudosConcluidos());
       System.out.println("XP: " + devNathalia.calcularTotalXp());

       System.out.println(" ----------- ");

       Dev devJoao = new Dev();
       devJoao.setNome("João");
       devJoao.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
       devJoao.progredir();
       devJoao.progredir();
       devJoao.progredir();
       System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
       System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
       System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
