/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprvva;
import java.io.FileInputStream;

public class sprhae {
    public static void main(String[] arg0) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(arg0[0]);
        sprgle sprgle2 = new sprgle(fileInputStream);
        sprvva sprvva2 = null;
        sprgle sprgle3 = sprgle2;
        while ((sprvva2 = sprgle3.cfr_renamed_24()) != null) {
            System.out.println(sprcje.cfr_renamed_2138(sprvva2));
            sprgle3 = sprgle2;
        }
    }
}

