package Stream_api.oop.average_level.qwen.score;

class Score {
    int studentId;
    double score;

    public Score(int studentId, double score) {
        this.studentId = studentId;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getScore() {
        return score;
    }
}