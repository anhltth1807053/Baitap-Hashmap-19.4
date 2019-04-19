package collatian;


import entity.Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Example {
    private static Object currentView;

    public static void main(String[] args) throws IOException {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        FileReader fileReader = new FileReader("src/main/resources/Tom&Jerry.txt");
//        Scanner scanner= new Scanner(file);
//        while(scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();
//        FileInputStream fileInputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//        while (true){
//            int c = inputStreamReader.read();
//            if (c==-1){
//                break;
//            }
//            System.out.print((char)c);
//        }
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            System.out.println(line);
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                String view = splitted[3];
                System.out.println("day: " + day);
                System.out.println("id: " + id);
                System.out.println("title: " + title);
                System.out.println("view: " + view);
                Movie movie = new Movie(day, id, title, view);
                movies.add(movie);
            }
            HashMap<String, MovieStatic> statistic = new HashMap<String, MovieStatic>();
            for (Movie movie :
                    movies) {
                int currentView = 0;
                if (statistic.containsKey(movie.getId())) {
                    MovieStatic movieStatic = statistic.get(movie.getId());
                    currentView = movieStatic.getView();
                }
                currentView = currentView + movie.getView();
                MovieStatic movieStatic = new MovieStatic(movie.getId(), movie.getTitle(), currentView);
                statistic.put(movie.getId(),movieStatic);
            }
            for (String id :
                    statistic.keySet()) {
                System.out.println(id);
                MovieStatic movieStatic = statistic.get(id);
                System.out.println(movieStatic.getTitle());
                System.out.println(movieStatic.getView());
            }
        }

    }

}
