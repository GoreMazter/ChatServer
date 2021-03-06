/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.sql.Timestamp;

/**
 *
 * @author lghhs
 */
public class MensajesGrupo {
    private int id_mg;
    private int usuario;
    private int grupo;
    private String mensaje;
    private Timestamp timestamp;
    
    /**
     * Constructor vacío que inicializa todo en 0 y null
     */
    public MensajesGrupo ()
    {
        id_mg = 0;
        usuario = 0;
        grupo = 0;
        timestamp = null;
    }
    
    /**
     * Connstructor para asignar todas las variables del mensaje
     * @param usuario
     * @param grupo
     * @param timestamp 
     */
    public MensajesGrupo(int id_mg, int usuario, int grupo, Timestamp timestamp, String mensaje)
    {
        this.id_mg = id_mg;
        this.usuario = usuario;
        this.grupo = grupo;
        this.timestamp = timestamp;
        this.mensaje = mensaje;
    }

    /**
     * Obtiene la id del mensaje
     * @return 
     */
    public int getId_mg() {
        return id_mg;
    }

    /**
     * Coloca la id a un mensaje
     * @param id_mg 
     */
    public void setId_mg(int id_mg) {
        this.id_mg = id_mg;
    }

    /**
     * Obtiene la id del usaurio del mensaje
     * @return 
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * Coloca la id del usuario del mensaje
     * @param usuario 
     */
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la id del grupo del mensaje
     * @return 
     */
    public int getGrupo() {
        return grupo;
    }

    /**
     * Coloca la id del grupo  del mensaje
     * @param grupo 
     */
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    /**
     * Obtiene la fecha y hora del mensaje
     * @return 
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Coloca la fecha y hora del mensaje
     * @param timestamp 
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Obtiene el mensaje
     * @return 
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Coloca un mensaje
     * @param mensaje 
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
