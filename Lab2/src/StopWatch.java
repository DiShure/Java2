public class StopWatch {
    private long startTime;
    private long endTime;

    // Безаргументный конструктор, инициализирующий startTime текущим временем
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Метод для сброса startTime до текущего времени
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Метод для установки endTime текущим временем
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Метод для получения прошедшего времени в миллисекундах
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    // Getter для startTime
    public long getStartTime() {
        return this.startTime;
    }

    // Getter для endTime
    public long getEndTime() {
        return this.endTime;
    }
}