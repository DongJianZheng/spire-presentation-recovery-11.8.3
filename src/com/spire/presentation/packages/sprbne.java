/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprcaz;
import com.spire.presentation.packages.sprdpe;
import com.spire.presentation.packages.sprhle;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprpne;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsra;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public abstract class sprbne
extends sprvva {
    public Vector cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbne(spra[] spraArray) {
        void arg0;
        int n;
        sprbne sprbne2 = this;
        sprbne2.cfr_renamed_4 = new Vector();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            this.cfr_renamed_4.addElement(arg0[n++]);
            n2 = n;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprbne)) {
            return false;
        }
        sprbne sprbne2 = (sprbne)arg0;
        if (this.cfr_renamed_84() != sprbne2.cfr_renamed_84()) {
            return false;
        }
        Enumeration enumeration = this.cfr_renamed_329();
        Enumeration enumeration2 = sprbne2.cfr_renamed_329();
        block0: while (true) {
            Enumeration enumeration3 = enumeration;
            while (enumeration3.hasMoreElements()) {
                sprvva sprvva2;
                sprbne sprbne3 = this;
                spra spra2 = sprbne3.cfr_renamed_4443(enumeration);
                spra spra3 = sprbne3.cfr_renamed_4443(enumeration2);
                sprvva sprvva3 = spra2.cfr_renamed_119();
                if (sprvva3 == (sprvva2 = spra3.cfr_renamed_119())) continue block0;
                if (!sprvva3.equals(sprvva2)) return false;
                enumeration3 = enumeration;
            }
            break;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprbne(sprlre sprlre2) {
        void arg0;
        int n;
        sprbne sprbne2 = this;
        sprbne2.cfr_renamed_4 = new Vector();
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            this.cfr_renamed_4.addElement(arg0.cfr_renamed_576(n++));
            n2 = n;
        }
    }

    @Override
    public abstract void cfr_renamed_4613(sprope var1) throws IOException;

    @Override
    public boolean cfr_renamed_4575() {
        return true;
    }

    public static sprbne cfr_renamed_23(Object arg0) {
        sprvva sprvva2;
        if (arg0 == null || arg0 instanceof sprbne) {
            return (sprbne)arg0;
        }
        if (arg0 instanceof sprao) {
            return sprbne.cfr_renamed_23(((sprao)arg0).cfr_renamed_119());
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprbne.cfr_renamed_23(sprbne.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprsra.cfr_renamed_9("\u0007\n\b\u0007\u0004\u000fA\u001f\u000eK\u0002\u0004\u000f\u0018\u0015\u0019\u0014\b\u0015K\u0012\u000e\u0010\u001e\u0004\u0005\u0002\u000eA\r\u0013\u0004\fK\u0003\u0012\u0015\u000e:6[K")).append(iOException.getMessage()).toString());
            }
        }
        if (arg0 instanceof spra && (sprvva2 = ((spra)arg0).cfr_renamed_119()) instanceof sprbne) {
            return (sprbne)sprvva2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("\u0014u\nu\u000el\u000f;\u000ey\u000b~\u0002oAr\u000f;\u0006~\u0015R\u000fh\u0015z\u000fx\u0004!A")).append(arg0.getClass().getName()).toString());
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
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

    public spra cfr_renamed_85(int arg0) {
        return (spra)this.cfr_renamed_4.elementAt(arg0);
    }

    @Override
    public int hashCode() {
        sprbne sprbne2 = this;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        int n = sprbne2.cfr_renamed_84();
        Enumeration enumeration2 = enumeration;
        while (enumeration2.hasMoreElements()) {
            spra spra2 = this.cfr_renamed_4443(enumeration);
            n *= 17;
            n ^= spra2.hashCode();
            enumeration2 = enumeration;
        }
        return n;
    }

    @Override
    public sprvva cfr_renamed_4612() {
        ((sprbne)new sprhle()).cfr_renamed_4 = this.cfr_renamed_4;
        return new sprhle();
    }

    public Enumeration cfr_renamed_329() {
        return this.cfr_renamed_4.elements();
    }

    private /* synthetic */ spra cfr_renamed_4443(Enumeration arg0) {
        return (spra)arg0.nextElement();
    }

    public String toString() {
        return this.cfr_renamed_4.toString();
    }

    public static sprbne cfr_renamed_341(spryte arg0, boolean arg1) {
        if (arg1) {
            if (!arg0.cfr_renamed_4567()) {
                throw new IllegalArgumentException(sprsra.cfr_renamed_9("\u000e\t\u000b\u000e\u0002\u001fA\u0002\f\u001b\r\u0002\u0002\u0002\u0015KLK\u0004\u0013\u0011\u0007\b\b\b\u001fA\u000e\u0019\u001b\u0004\b\u0015\u000e\u0005E"));
            }
            return sprbne.cfr_renamed_23(arg0.cfr_renamed_2456().cfr_renamed_119());
        }
        if (arg0.cfr_renamed_4567()) {
            if (arg0 instanceof sprdpe) {
                return new sprjve(arg0.cfr_renamed_2456());
            }
            return new sprhle(arg0.cfr_renamed_2456());
        }
        if (arg0.cfr_renamed_2456() instanceof sprbne) {
            return (sprbne)arg0.cfr_renamed_2456();
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("\u0014u\nu\u000el\u000f;\u000ey\u000b~\u0002oAr\u000f;\u0006~\u0015R\u000fh\u0015z\u000fx\u0004!A")).append(arg0.getClass().getName()).toString());
    }

    public sprbne() {
        sprbne sprbne2 = this;
        sprbne2.cfr_renamed_4 = new Vector();
    }

    /*
     * WARNING - void declaration
     */
    public sprbne(spra spra2) {
        void arg0;
        this.cfr_renamed_4 = new Vector();
        this.cfr_renamed_4.addElement(arg0);
    }

    @Override
    public sprvva cfr_renamed_4615() {
        ((sprbne)new sprpse()).cfr_renamed_4 = this.cfr_renamed_4;
        return new sprpse();
    }

    public sprao cfr_renamed_4828() {
        sprbne sprbne2 = this;
        return new sprpne(this, sprbne2);
    }
}

