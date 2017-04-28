/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model;

import java.awt.image.BufferedImage;

/**
 *
 * @author ramones
 */
public class Pagina {
    
    private long id_pagina;
    private BufferedImage imagem;

    public long getId_pagina() {
        return id_pagina;
    }

    public void setId_pagina(long id_pagina) {
        this.id_pagina = id_pagina;
    }

    @Override
    public String toString() {
        return "Pagina{" + "id_pagina=" + id_pagina + '}';
    }
    
    
}
