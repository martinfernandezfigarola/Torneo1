// Equipo.java
public class Equipo {
    private String nombre;
    private int fans;
    private int puntos;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesConvertidos;
    private int golesRecibidos;

    public Equipo(String nombre, int fans) {
        this.nombre = nombre;
        this.fans = fans;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getFans() { return fans; }
    public int getPuntos() { return puntos; }
    public int getPartidosJugados() { return partidosJugados; }
    public int getGolesConvertidos() { return golesConvertidos; }
    public int getGolesRecibidos() { return golesRecibidos; }
    public int getDiferenciaGoles() { return golesConvertidos - golesRecibidos; }

    // Métodos para actualizar estadísticas
    public void actualizarEstadisticas(int golesAFavor, int golesEnContra) {
        golesConvertidos += golesAFavor;
        golesRecibidos += golesEnContra;
        partidosJugados++;

        if (golesAFavor > golesEnContra) {
            puntos += 3;
            partidosGanados++;
        } else if (golesAFavor == golesEnContra) {
            puntos += 1;
            partidosEmpatados++;
        } else {
            partidosPerdidos++;
        }
    }
}
