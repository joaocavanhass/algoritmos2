package src;

import java.io.File;

public class DiretorioRecursivo {
    // método recursivo que, dado um file que reprensenta um diretorio,
    // retorna o total de bytes de todos os arquivos contidos nele (recursivamente)
    public static long folderSize(File folder) {
        long total = 0L; // acumulador de bytes

        //ListFiles() retorna null se houver problemas de segurança ou I/O,
        // então sempre verificamos se o retorno é nulo
        File[] files = folder.listFiles();// obtém conteúdo do diretório
        if (files == null) {// se não pode listar (permissão, etc.)
            return 0L;// considera 0 e não tenta processar
        }
        // percorre cada entrada no diretório
        for (File f : files) {
            if(f.isFile()) {
                total += f.length();
            } else if (f.isDirectory()) {
                total += folderSize(f);
            }
        }
        // note: não lidamos aqui com links simbólicos, que podem produzir ciclos
        // em sistemas com links simbólicos, é preciso tomar um pouco de cuidado, para evitar loop infinito
        return total;
    }
    // função utilitária para formatar bytes em KB/MB/GB legíveis
    public static String ByteCount (long bytes) {
        // simples formatação em potências de 1024
        if (bytes < 1024) return bytes + "B";
        int exp = (int)(Math.log(bytes) / Math.log(1024));
        char unit = "KMGTPE".charAt(exp - 1); // K, M, G...
        double value = bytes / Math.pow(1024, exp);
        DecimalFormat df = new DecimalFormat("#,##0,##");
        return df.format(value) + "" + unit + "B";
    }

   public static void main(String[] args) {
    // se o meu usuário passou um argumento(caminho), usa; senão usa o diretório atual
    String path  = args.length > 0 ? args[0] : ".";
    File root = new root
   }
}