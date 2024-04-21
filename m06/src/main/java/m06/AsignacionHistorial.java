package m06;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignacion_historial")
public class AsignacionHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_lector")
    private int idLector;

    @Column(name = "id_libro")
    private int idLibro;

    @Column(name = "fecha_asignacion")
    private LocalDateTime fechaAsignacion;

    // Constructor vacío
    public AsignacionHistorial() {
    }

    // Constructor con todos los atributos
    public AsignacionHistorial(int id, int idLector, int idLibro, LocalDateTime fechaAsignacion) {
        this.id = id;
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.fechaAsignacion = fechaAsignacion;
    }

    // Getters y setters para todos los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public String toString() {
        return "AsignacionHistorial{" +
                "id=" + id +
                ", idLector=" + idLector +
                ", idLibro=" + idLibro +
                ", fechaAsignacion=" + fechaAsignacion +
                '}';
    }
}
