/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprfio;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmcp;
import com.spire.presentation.packages.sprnqe;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprpte;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public abstract class sprere
extends sprvva {
    private Vector cfr_renamed_3;
    private boolean cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_3.toString();
    }

    @Override
    public abstract void cfr_renamed_4613(sprope var1) throws IOException;

    private /* synthetic */ boolean cfr_renamed_4920(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = Math.min(arg0.length, arg1.length);
        int n3 = n = 0;
        while (n3 != n2) {
            if (arg0[n] != arg1[n]) {
                return (arg0[n] & 0xFF) < (arg1[n] & 0xFF);
            }
            n3 = ++n;
        }
        return n2 == arg0.length;
    }

    /*
     * WARNING - void declaration
     */
    public sprere(spra spra2) {
        void arg0;
        sprere sprere2 = this;
        this.cfr_renamed_3 = new Vector();
        this.cfr_renamed_4 = false;
        this.cfr_renamed_3.addElement(arg0);
    }

    public sprbl cfr_renamed_4828() {
        sprere sprere2 = this;
        return new sprpte(this, sprere2);
    }

    public static sprere cfr_renamed_341(spryte arg0, boolean arg1) {
        if (arg1) {
            if (!arg0.cfr_renamed_4567()) {
                throw new IllegalArgumentException(sprfio.cfr_renamed_9("cBfEoT,IaP`IoIx\u0000!\u0000iX|LeCeT,EtPiCxEh\u000e"));
            }
            return (sprere)arg0.cfr_renamed_2456();
        }
        if (arg0.cfr_renamed_4567()) {
            if (arg0 instanceof sprdpe) {
                return new sprgve(arg0.cfr_renamed_2456());
            }
            return new sprnqe(arg0.cfr_renamed_2456());
        }
        if (arg0.cfr_renamed_2456() instanceof sprere) {
            return (sprere)arg0.cfr_renamed_2456();
        }
        if (arg0.cfr_renamed_2456() instanceof sprbne) {
            sprbne sprbne2 = (sprbne)arg0.cfr_renamed_2456();
            if (arg0 instanceof sprdpe) {
                return new sprgve(sprbne2.cfr_renamed_4529());
            }
            return new sprnqe(sprbne2.cfr_renamed_4529());
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmcp.cfr_renamed_9("g~y~}g|0}rxuqd2y|0uufY|cfq|sw*2")).append(arg0.getClass().getName()).toString());
    }

    public void cfr_renamed_4921() {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_4 = true;
            if (this.cfr_renamed_3.size() > 1) {
                boolean bl = true;
                int n = this.cfr_renamed_3.size() - 1;
                boolean bl2 = bl;
                while (bl2) {
                    int n2 = 0;
                    int n3 = 0;
                    sprere sprere2 = this;
                    byte[] byArray = sprere2.cfr_renamed_4922((spra)sprere2.cfr_renamed_3.elementAt(0));
                    bl = false;
                    int n4 = n2;
                    while (n4 != n) {
                        sprere sprere3 = this;
                        byte[] byArray2 = sprere3.cfr_renamed_4922((spra)sprere3.cfr_renamed_3.elementAt(n2 + 1));
                        if (this.cfr_renamed_4920(byArray, byArray2)) {
                            byArray = byArray2;
                        } else {
                            sprere sprere4 = this;
                            Object e = sprere4.cfr_renamed_3.elementAt(n2);
                            sprere4.cfr_renamed_3.setElementAt(this.cfr_renamed_3.elementAt(n2 + 1), n2);
                            sprere4.cfr_renamed_3.setElementAt(e, n2 + 1);
                            bl = true;
                            n3 = n2;
                        }
                        n4 = ++n2;
                    }
                    n = n3;
                    bl2 = bl;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprere(spra[] spraArray, boolean bl) {
        void arg1;
        void arg0;
        int n;
        sprere sprere2 = this;
        this.cfr_renamed_3 = new Vector();
        this.cfr_renamed_4 = 0;
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            this.cfr_renamed_3.addElement(arg0[n++]);
            n2 = n;
        }
        if (arg1 != false) {
            this.cfr_renamed_4921();
        }
    }

    public spra[] cfr_renamed_4529() {
        int n;
        spra[] spraArray = new spra[this.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_84()) {
            int n3 = n++;
            spraArray[n3] = this.cfr_renamed_85(n3);
            n2 = n;
        }
        return spraArray;
    }

    private /* synthetic */ spra cfr_renamed_4443(Enumeration arg0) {
        spra spra2 = (spra)arg0.nextElement();
        if (spra2 == null) {
            return sprume.cfr_renamed_3;
        }
        return spra2;
    }

    public sprere() {
        sprere sprere2 = this;
        this.cfr_renamed_3 = new Vector();
        this.cfr_renamed_4 = false;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_3.size();
    }

    @Override
    public sprvva cfr_renamed_4612() {
        new sprnqe().cfr_renamed_3 = this.cfr_renamed_3;
        return new sprnqe();
    }

    public spra cfr_renamed_85(int arg0) {
        return (spra)this.cfr_renamed_3.elementAt(arg0);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_4922(spra arg0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprope sprope2 = new sprope(byteArrayOutputStream);
        try {
            sprope2.cfr_renamed_2149(arg0);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprfio.cfr_renamed_9("CmNbOx\u0000iNoOhE,OnJiCx\u0000mDhEh\u0000xO,sIt"));
        }
    }

    @Override
    public sprvva cfr_renamed_4615() {
        int n;
        if (this.cfr_renamed_4) {
            sprcwe sprcwe2 = new sprcwe();
            sprcwe2.cfr_renamed_3 = this.cfr_renamed_3;
            return sprcwe2;
        }
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            vector.addElement(this.cfr_renamed_3.elementAt(n++));
            n2 = n;
        }
        sprcwe sprcwe3 = new sprcwe();
        sprcwe3.cfr_renamed_3 = vector;
        sprcwe3.cfr_renamed_4921();
        return sprcwe3;
    }

    /*
     * WARNING - void declaration
     */
    public sprere(sprlre sprlre2, boolean bl) {
        void arg1;
        void arg0;
        int n;
        sprere sprere2 = this;
        this.cfr_renamed_3 = new Vector();
        this.cfr_renamed_4 = 0;
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            this.cfr_renamed_3.addElement(arg0.cfr_renamed_576(n++));
            n2 = n;
        }
        if (arg1 != false) {
            this.cfr_renamed_4921();
        }
    }

    public Enumeration cfr_renamed_329() {
        return this.cfr_renamed_3.elements();
    }

    @Override
    public int hashCode() {
        sprere sprere2 = this;
        Enumeration enumeration = sprere2.cfr_renamed_329();
        int n = sprere2.cfr_renamed_84();
        Enumeration enumeration2 = enumeration;
        while (enumeration2.hasMoreElements()) {
            spra spra2 = this.cfr_renamed_4443(enumeration);
            n *= 17;
            n ^= spra2.hashCode();
            enumeration2 = enumeration;
        }
        return n;
    }

    public static sprere cfr_renamed_23(Object arg0) {
        sprvva sprvva2;
        if (arg0 == null || arg0 instanceof sprere) {
            return (sprere)arg0;
        }
        if (arg0 instanceof sprbl) {
            return sprere.cfr_renamed_23(((sprbl)arg0).cfr_renamed_119());
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprere.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprmcp.cfr_renamed_9("tq{|wt2d}0q\u007f|cfbgsf0auf0tb}}2rkdwKO*2")).append(iOException.getMessage()).toString());
            }
        }
        if (arg0 instanceof spra && (sprvva2 = ((spra)arg0).cfr_renamed_119()) instanceof sprere) {
            return (sprere)sprvva2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfio.cfr_renamed_9("UbKbO{N,OnJiCx\u0000eN,GiTEN\u007fTmNoE6\u0000")).append(arg0.getClass().getName()).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprere)) {
            return false;
        }
        sprere sprere2 = (sprere)arg0;
        if (this.cfr_renamed_84() != sprere2.cfr_renamed_84()) {
            return false;
        }
        Enumeration enumeration = this.cfr_renamed_329();
        Enumeration enumeration2 = sprere2.cfr_renamed_329();
        block0: while (true) {
            Enumeration enumeration3 = enumeration;
            while (enumeration3.hasMoreElements()) {
                sprvva sprvva2;
                sprere sprere3 = this;
                spra spra2 = sprere3.cfr_renamed_4443(enumeration);
                spra spra3 = sprere3.cfr_renamed_4443(enumeration2);
                sprvva sprvva3 = spra2.cfr_renamed_119();
                if (sprvva3 == (sprvva2 = spra3.cfr_renamed_119())) continue block0;
                if (!sprvva3.equals(sprvva2)) return false;
                enumeration3 = enumeration;
            }
            break;
        }
        return true;
    }
}

