package week4;

import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();
        
        System.out.println("Welcome to Mini Quiz Game!");
        System.out.println("Jawablah semua pertanyaan dengan memilih nomor opsi.");
        
        // Looping dari setiap pertanyaan
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Total correct answer: ");
            int userAnswer = scanner.nextInt();
            quiz.checkAnswer(i, userAnswer);
        }
        
        // Tampilkan skor akhir
        int totalScore = quiz.getQuestionCount() * 10;
        System.out.println("\nAll Done!");
        System.out.println("Score akhir Anda: " + quiz.getScore() + " dari " + totalScore);
        
        // Kondisional untuk pesan berdasarkan skor
        if (quiz.getScore() == totalScore) {
            System.out.println("Perfect. Kecerdasanmu diatas rata rata!");
        } else if (quiz.getScore() >= totalScore / 2) {
            System.out.println("Cukup bagus! Kecerdasanmu average.");
        } else {
            System.out.println("Nice try! Coba lagi lain kali.");
        }
        
        //karena kalo pake scanner close nanti gabisa masukin inputan lagi
        scanner.close();
    }
}
