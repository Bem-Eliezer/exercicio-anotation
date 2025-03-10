public class App {
    public static void main(String[] args) {
       Class<NomeDaTabela> clazz = NomeDaTabela.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A anotação @Tabela nao esta presente");
        }

    }

    }
