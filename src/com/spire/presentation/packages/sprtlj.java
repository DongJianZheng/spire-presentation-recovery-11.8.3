/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprrzm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprtlj
implements sprof {
    private Hashtable cfr_renamed_3;
    private Vector cfr_renamed_4;

    public void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        sprlem sprlem2;
        sprrzm sprrzm2;
        Object object = arg0.readObject();
        if (object instanceof Hashtable) {
            this.cfr_renamed_3 = (Hashtable)object;
            this.cfr_renamed_4 = (Vector)arg0.readObject();
            return;
        }
        sprrzm sprrzm3 = sprrzm2 = new sprrzm((byte[])object);
        while ((sprlem2 = (sprlem)sprrzm3.cfr_renamed_24()) != null) {
            sprrzm sprrzm4 = sprrzm2;
            sprrzm3 = sprrzm4;
            this.cfr_renamed_9065(sprlem2, sprrzm4.cfr_renamed_24());
        }
    }

    public sprtlj() {
        this(new Hashtable(), new Vector());
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        if (this.cfr_renamed_3.containsKey(arg0)) {
            this.cfr_renamed_3.put(arg0, arg1);
            return;
        }
        this.cfr_renamed_3.put(arg0, arg1);
        this.cfr_renamed_4.addElement(arg0);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_4.elements();
    }

    public Vector cfr_renamed_586() {
        return this.cfr_renamed_4;
    }

    public Hashtable cfr_renamed_82() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return (sprco)this.cfr_renamed_3.get(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprtlj(Hashtable hashtable, Vector vector) {
        void arg0;
        sprtlj sprtlj2 = this;
        sprtlj2.cfr_renamed_3 = arg0;
        sprtlj2.cfr_renamed_4 = vector;
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
        sproen sproen2 = sproen.cfr_renamed_5101(byteArrayOutputStream);
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2158();
        while (enumeration2.hasMoreElements()) {
            sprlem sprlem2 = sprlem.cfr_renamed_23(enumeration.nextElement());
            sproen sproen3 = sproen2;
            sproen3.cfr_renamed_9373(sprlem2);
            sproen3.cfr_renamed_5102((sprco)this.cfr_renamed_3.get(sprlem2));
            enumeration2 = enumeration;
        }
        arg0.writeObject(byteArrayOutputStream.toByteArray());
    }
}

