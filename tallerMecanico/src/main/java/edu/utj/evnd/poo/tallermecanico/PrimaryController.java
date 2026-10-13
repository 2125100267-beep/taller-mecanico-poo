package edu.utj.evnd.poo.tallermecanico;

import edu.utj.evnd.poo.tallermecanico.enums.EstadoAdministrador;
import edu.utj.evnd.poo.tallermecanico.model.Administrador;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController implements Initializable {

    // Campos de texto - Persona
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtCurp;
    @FXML
    private TextField txtRfc;
    @FXML
    private TextField txtNombres;
    @FXML
    private TextField txtApellidos;
    @FXML
    private DatePicker dpNacimiento; // <-- Debe ser DatePicker
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtUrlImagen;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasena; // <-- Si en FXML pusiste TextField
    @FXML
    private ComboBox<EstadoAdministrador> cbxEstado; // <-- Debe ser ComboBox
    @FXML
    private TextField txtRol;

    // --- BOTONES ---
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnActualizar;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnCancelar;

    // --- TABLA Y COLUMNAS ---
    @FXML
    private TableView<Administrador> tblAdministradores;
    @FXML
    private TableColumn<Administrador, Integer> colId;
    @FXML
    private TableColumn<Administrador, String> colCurp;
    @FXML
    private TableColumn<Administrador, String> colRfc;
    @FXML
    private TableColumn<Administrador, String> colNombres;
    @FXML
    private TableColumn<Administrador, String> colApellidos;
    @FXML
    private TableColumn<Administrador, String> colUsuario;
    @FXML
    private TableColumn<Administrador, EstadoAdministrador> colEstado;
    @FXML
    private TableColumn<Administrador, String> colRol;

    // Lista observable para los datos de la tabla
    private final ObservableList<Administrador> listaAdministradores = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Cargar los valores del Enum EstadoAdministrador en el ComboBox
        if (cbxEstado != null) {
            cbxEstado.getItems().setAll(EstadoAdministrador.values());
            cbxEstado.getSelectionModel().selectFirst();
        }

        // Vincular las columnas de la tabla con los atributos del Administrador
        if (tblAdministradores != null) {
            colId.setCellValueFactory(new PropertyValueFactory<>("id"));
            colCurp.setCellValueFactory(new PropertyValueFactory<>("curp"));
            colRfc.setCellValueFactory(new PropertyValueFactory<>("rfc"));
            colNombres.setCellValueFactory(new PropertyValueFactory<>("nombres"));
            colApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
            colUsuario.setCellValueFactory(new PropertyValueFactory<>("usuario"));
            colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
            colRol.setCellValueFactory(new PropertyValueFactory<>("rol"));

            // Conectar la lista a la tabla
            tblAdministradores.setItems(listaAdministradores);
        }
    }

    @FXML
    private void onAgregar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String curp = txtCurp.getText();
            String rfc = txtRfc.getText();
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            LocalDate fechaNac = dpNacimiento.getValue();
            String correo = txtCorreo.getText();
            String telefono = txtTelefono.getText();

            String urlImagen = txtUrlImagen.getText();
            String usuario = txtUsuario.getText();
            String contrasena = txtContrasena.getText();
            EstadoAdministrador estado = cbxEstado.getValue();
            String rol = txtRol.getText();

            Administrador nuevoAdmin = new Administrador(
                    id, curp, rfc, nombres, apellidos, fechaNac,
                    correo, telefono, urlImagen, usuario, contrasena, estado, rol
            );

            listaAdministradores.add(nuevoAdmin);
            onLimpiar();

        } catch (NumberFormatException e) {
            System.out.println("El ID debe ser un número entero válido.");
        } catch (Exception e) {
            System.out.println("Error al agregar el registro: " + e.getMessage());
        }
    }

    @FXML
    private void onLimpiar() {
        if (txtId != null) {
            txtId.clear();
        }
        if (txtCurp != null) {
            txtCurp.clear();
        }
        if (txtRfc != null) {
            txtRfc.clear();
        }
        if (txtNombres != null) {
            txtNombres.clear();
        }
        if (txtApellidos != null) {
            txtApellidos.clear();
        }
        if (dpNacimiento != null) {
            dpNacimiento.setValue(null);
        }
        if (txtCorreo != null) {
            txtCorreo.clear();
        }
        if (txtTelefono != null) {
            txtTelefono.clear();
        }
        if (txtUrlImagen != null) {
            txtUrlImagen.clear();
        }
        if (txtUsuario != null) {
            txtUsuario.clear();
        }
        if (txtContrasena != null) {
            txtContrasena.clear();
        }
        if (cbxEstado != null) {
            cbxEstado.setValue(null);
        }
        if (txtRol != null) {
            txtRol.clear();
        }
    }

    @FXML
    private void onBuscar() {
    }

    @FXML
    private void onEditar() {
    }

    @FXML
    private void onActualizar() {
    }

    @FXML
    private void onBorrar() {
    }

    @FXML
    private void onCancelar() {
        onLimpiar();
    }
}
