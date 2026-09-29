/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprooc
implements sprwb {
    private Hashtable cfr_renamed_3;
    private Vector cfr_renamed_4;

    public Vector cfr_renamed_586() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        Enumeration enumeration;
        if (this.cfr_renamed_4.size() == 0) {
            ObjectOutputStream objectOutputStream = arg0;
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprope sprope2 = new sprope(byteArrayOutputStream);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2158();
        while (enumeration2.hasMoreElements()) {
            sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
            sprope sprope3 = sprope2;
            sprope3.cfr_renamed_2149(sprtzd2);
            sprope3.cfr_renamed_2149((spra)this.cfr_renamed_3.get(sprtzd2));
            enumeration2 = enumeration;
        }
        arg0.writeObject(byteArrayOutputStream.toByteArray());
    }

    public void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        sprtzd sprtzd2;
        sprgle sprgle2;
        Object object = arg0.readObject();
        if (object instanceof Hashtable) {
            this.cfr_renamed_3 = (Hashtable)object;
            this.cfr_renamed_4 = (Vector)arg0.readObject();
            return;
        }
        sprgle sprgle3 = sprgle2 = new sprgle((byte[])object);
        while ((sprtzd2 = (sprtzd)sprgle3.cfr_renamed_24()) != null) {
            sprgle sprgle4 = sprgle2;
            sprgle3 = sprgle4;
            this.cfr_renamed_2152(sprtzd2, sprgle4.cfr_renamed_24());
        }
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_4.elements();
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        if (this.cfr_renamed_3.containsKey(arg0)) {
            this.cfr_renamed_3.put(arg0, arg1);
            return;
        }
        this.cfr_renamed_3.put(arg0, arg1);
        this.cfr_renamed_4.addElement(arg0);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public sprooc() {
        this(new Hashtable(), new Vector());
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return (spra)this.cfr_renamed_3.get(arg0);
    }

    public Hashtable cfr_renamed_82() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprooc(Hashtable hashtable, Vector vector) {
        void arg0;
        sprooc sprooc2 = this;
        sprooc2.cfr_renamed_3 = arg0;
        sprooc2.cfr_renamed_4 = vector;
    }
}

