// Torneo.java
import java.time.LocalDate;  // Importar LocalDate
import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<Equipo> equipos;
    private List<Partido> partidos;

    public Torneo() {
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    // Método para agregar un equipo al torneo
    public void cargarEquipo(String nombre, int fans) {
        Equipo equipo = new Equipo(nombre, fans);
        equipos.add(equipo);
    }

    // Método para agregar un partido al torneo
    public void cargarPartido(String nombreLocal, String nombreVisitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        Equipo equipoLocal = buscarEquipo(nombreLocal);
        Equipo equipoVisitante = buscarEquipo(nombreVisitante);

        if (equipoLocal != null && equipoVisitante != null) {
            Partido partido = new Partido(equipoLocal, equipoVisitante, fecha, golesLocal, golesVisitante);
            partidos.add(partido);

            // Actualizar estadísticas de los equipos
            equipoLocal.actualizarEstadisticas(golesLocal, golesVisitante);
            equipoVisitante.actualizarEstadisticas(golesVisitante, golesLocal);
        }
    }

    private Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre)) {
                return equipo;
            }
        }
        return null; // Retorna null si no encuentra el equipo
    }
    
    // Método para mostrar partidos jugados en una fecha específica
    public void mostrarPartidosFecha(LocalDate fecha) {
        System.out.println("Partidos jugados el " + fecha + ":");
        for (Partido partido : partidos) {
            if (partido.getFecha().equals(fecha)) {
                System.out.println(partido);
            }
        }
    }

    // Método para mostrar la tabla de posiciones
    public void mostrarTabla() {
        // Implementación futura para mostrar la tabla
    }
}

