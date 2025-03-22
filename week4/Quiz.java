package week4;

public class Quiz {
    private String [] questions = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?",
        "Siapakah pencipta bitcoin?",
        "Siapakah rektor UDINUS saat ini?",
        "Pada tahun berapa Bitcoin diciptakan?",
        "Siapakah penemu mesin uap?",
        "Apa bahan bakar kereta api?",
        "Apa negara terluas di dunia?",
        "Apa rumah adat Provinsi Aceh?"
    };

    private String[][] options = {
        {"1. Jakarta","2. Bandung","3. Surabaya", "4. Bali"},
        {"1. Harimau","2. Semute","3. Gajah", "4. Kucing"},
        {"1. Mars","2. Bumi","3. Jupiter", "4. Saturnus"},
        {"1. Chalida Abdat","2. Satoshi Nakamoto","3. Timothy Ronald", "4. Pak Didit"},
        {"1. Prof Edi","2. Pak Pulung","3. Pak Immanuel", "4. Pak Mada"},
        {"1. 2009","2. 2001","3. 2008", "4. 2010"},
        {"1. James Bond","2. Alexander Graham Bell","3. James Watt", "4. Emma Watsons"},
        {"1. Nikel","2. Batu Bara","3. Solar", "4. Pertalite"},
        {"1. Amerika","2. Indonesia","3. Arab Saudi", "4. Rusia"},
        {"1. Rumah Panjang","2. Gadang","3. Panggung", "4. Krong Bade"}
    };

    private int[] correctAnswers = {1, 2, 3, 2, 2, 1, 3, 2, 4, 4};
    private int score = 0;

    public int getQuestionCount(){
        return questions.length;
    }

    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j<options[index].length; j++){
            System.out.println(options[index][j]);
        }
    }

    public void checkAnswer (int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " +
                options[index] [correctAnswers[index] -1]);
        }
    }

    //Method untuk mendapatkan score
    public int getScore() {
        return score;
    }
}