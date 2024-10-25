// Partido.java
import java.time.LocalDate;
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private LocalDate fecha;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public LocalDate getFecha() { return fecha; }

    @Override
    public String toString() {
        return fecha + " - " + equipoLocal.getNombre() + " " + golesLocal + " vs " + equipoVisitante.getNombre() + " " + golesVisitante;
    }
}
