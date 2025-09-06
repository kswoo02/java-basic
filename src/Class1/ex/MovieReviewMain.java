package Class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "ㅎㅇ";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "아바타";
        movieReview2.review = "ㅈㅈ";

        MovieReview[] movies = {movieReview1, movieReview2};

        for (MovieReview m : movies) {
            System.out.println("영화 제목 : " + m.title + " 리뷰 :" + m.review);
        }


    }
    
}
