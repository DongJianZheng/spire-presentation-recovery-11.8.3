/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprqlfa;
import com.spire.presentation.packages.sprvva;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class sprdre
extends sprnle {
    private Vector cfr_renamed_3;
    private static final int cfr_renamed_4 = 1000;

    @Override
    public Enumeration cfr_renamed_329() {
        if (this.cfr_renamed_3 == null) {
            return this.cfr_renamed_4909().elements();
        }
        return this.cfr_renamed_3.elements();
    }

    /*
     * WARNING - void declaration
     */
    public sprdre(Vector vector) {
        super(sprdre.cfr_renamed_4913((Vector)arg0));
        void arg0;
        this.cfr_renamed_3 = vector;
    }

    public sprdre(byte[] arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_4913(Vector arg0) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 != arg0.size()) {
            try {
                sprlqe sprlqe2 = (sprlqe)arg0.elementAt(n);
                byteArrayOutputStream.write(sprlqe2.cfr_renamed_186());
            }
            catch (ClassCastException classCastException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, arg0.elementAt(n).getClass().getName()).append(sprchk.cfr_renamed_9("Fz\ti\bxFu\b<\u000fr\u0016i\u0012<\u0015t\ti\nxFs\bp\u001f<\u0005s\bh\u0007u\b<\"Y4S\u0005h\u0003h5h\u0014u\b{")).toString());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqlfa.cfr_renamed_9("QgWzDk]pZ?WpZiQm@vZx\u0014pWkQkG?")).append(iOException.toString()).toString());
            }
            n2 = ++n;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static sprnle cfr_renamed_4758(sprbne arg0) {
        Enumeration enumeration;
        Vector vector = new Vector();
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            vector.addElement(enumeration3.nextElement());
        }
        return new sprdre(vector);
    }

    public sprdre(spra arg0) {
        this(arg0.cfr_renamed_119());
    }

    @Override
    public byte[] cfr_renamed_186() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_4914(sprvva arg0) {
        try {
            return arg0.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("I\b}\u0004p\u0003<\u0012sFy\b\u007f\tx\u0003<\t~\fy\u0005h"));
        }
    }

    private /* synthetic */ Vector cfr_renamed_4909() {
        int n;
        Vector<sprlqe> vector = new Vector<sprlqe>();
        int n2 = n = 0;
        while (n2 < ((int)this.cfr_renamed_4).length) {
            byte[] byArray = new byte[(n + 1000 > ((int)this.cfr_renamed_4).length ? ((int)this.cfr_renamed_4).length : n + 1000) - n];
            System.arraycopy(this.cfr_renamed_4, n, byArray, 0, byArray.length);
            vector.addElement(new sprlqe(byArray));
            n2 = n += 1000;
        }
        return vector;
    }

    public sprdre(sprvva arg0) {
        super(sprdre.cfr_renamed_4914(arg0));
    }
}

