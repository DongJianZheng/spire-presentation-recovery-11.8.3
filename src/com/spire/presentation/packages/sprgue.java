/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprkfe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprobe;
import com.spire.presentation.packages.sprtee;
import com.spire.presentation.packages.sprtpe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxro;
import com.spire.presentation.packages.spryde;
import com.spire.presentation.packages.spryur;
import java.io.IOException;

public class sprgue
extends sprkra {
    private static int cfr_renamed_119 = 1;
    private int cfr_renamed_91;
    public static String cfr_renamed_0;
    private sprtpe cfr_renamed_1;
    public static final byte cfr_renamed_2 = 0;
    private byte[] cfr_renamed_3;
    private static int cfr_renamed_4;

    public sprkfe cfr_renamed_4710() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4711();
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_4712(sprgle arg0) throws IOException {
        sprvva sprvva2;
        sprgle sprgle2 = arg0;
        while ((sprvva2 = sprgle2.cfr_renamed_24()) != null) {
            if (sprvva2 instanceof sprgwe) {
                this.cfr_renamed_4713((sprgwe)sprvva2);
                sprgle2 = arg0;
                continue;
            }
            throw new IOException(spryur.cfr_renamed_9(">2\u0001=\u001b5\u0013|>2\u0007)\u0003|$(\u00059\u00161W:\u0018.W?\u00059\u0016(\u001e2\u0010|\u00162W\u0015\u00043@dFj49\u0005(\u001e:\u001e?\u0016(\u0012\u000f\u0003.\u0002?\u0003)\u00059"));
        }
    }

    public int cfr_renamed_4714() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4715().cfr_renamed_4716() & 0xC0;
    }

    private /* synthetic */ sprgue(sprgwe sprgwe2) throws IOException {
        sprgue sprgue2 = this;
        sprgue2.cfr_renamed_4713(sprgwe2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_4713(sprgwe sprgwe2) throws IOException {
        void arg0;
        this.cfr_renamed_91 = 0;
        if (sprgwe2.cfr_renamed_4576() == 33) {
            sprvva sprvva2;
            sprgle sprgle2;
            sprgle sprgle3 = sprgle2 = new sprgle(arg0.cfr_renamed_4577());
            block4: while ((sprvva2 = sprgle3.cfr_renamed_24()) != null) {
                if (sprvva2 instanceof sprgwe) {
                    sprgwe sprgwe3 = (sprgwe)sprvva2;
                    switch (sprgwe3.cfr_renamed_4576()) {
                        case 78: {
                            this.cfr_renamed_1 = sprtpe.cfr_renamed_23(sprgwe3);
                            this.cfr_renamed_91 |= cfr_renamed_119;
                            sprgle3 = sprgle2;
                            continue block4;
                        }
                        case 55: {
                            while (false) {
                            }
                            this.cfr_renamed_3 = sprgwe3.cfr_renamed_4577();
                            this.cfr_renamed_91 |= cfr_renamed_4;
                            sprgle3 = sprgle2;
                            continue block4;
                        }
                    }
                    throw new IOException(new StringBuilder().insert(0, sprxro.cfr_renamed_9("P\u001bo\u0014u\u001c}Um\u0014~Y9\u001bv\u00019\u0014wUP\u0006vB!D/6|\u0007m\u001c\u007f\u001cz\u0014m\u0010J\u0001k\u0000z\u0001l\u0007|U#")).append(sprgwe3.cfr_renamed_4576()).toString());
                }
                throw new IOException(spryur.cfr_renamed_9(">2\u0001=\u001b5\u0013|8>\u001d9\u0014([|\u00193\u0003|\u00162W\u0015\u00043@dFj49\u0005(\u001e:\u001e?\u0016(\u0012\u000f\u0003.\u0002?\u0003)\u00059"));
            }
        } else {
            throw new IOException(new StringBuilder().insert(0, sprxro.cfr_renamed_9("\u001bv\u00019\u001496X']=V9]0K*Z0K!P3P6X!\\U#")).append(arg0.cfr_renamed_4576()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_91 != (cfr_renamed_4 | cfr_renamed_119)) {
            return null;
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        try {
            sprlre2.cfr_renamed_49(new sprgwe(false, 55, new sprlqe(this.cfr_renamed_3)));
            return new sprgwe(33, sprlre2);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(spryur.cfr_renamed_9("\u00022\u0016>\u001b9W(\u0018|\u00143\u0019*\u0012.\u0003|\u00045\u00102\u0016(\u0002.\u0012}"));
        }
    }

    public int cfr_renamed_4717() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4715().cfr_renamed_4716();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgue cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgue) {
            return (sprgue)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return new sprgue(sprgwe.cfr_renamed_23(arg0));
        }
        catch (IOException iOException) {
            throw new spraqe(new StringBuilder().insert(0, sprxro.cfr_renamed_9("\u0000w\u0014{\u0019|Um\u001a9\u0005x\u0007j\u00109\u0011x\u0001xO9")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprkfe cfr_renamed_4718() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4719();
    }

    public sprtzd cfr_renamed_4720() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4715().cfr_renamed_4721();
    }

    public sprgue(sprgle sprgle2) throws IOException {
        sprgue sprgue2 = this;
        sprgue2.cfr_renamed_4712(sprgle2);
    }

    public sprobe cfr_renamed_4722() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4723();
    }

    public sprtee cfr_renamed_4724() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_4725();
    }

    static {
        cfr_renamed_4 = 2;
        cfr_renamed_0 = "ISO-8859-1";
    }

    public spryde cfr_renamed_4726() throws IOException {
        return new spryde(this.cfr_renamed_1.cfr_renamed_4715().cfr_renamed_4716() & 0x1F);
    }

    public sprgue(sprtpe arg0, byte[] arg1) throws IOException {
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_3 = arg1;
        this.cfr_renamed_91 |= cfr_renamed_119;
        this.cfr_renamed_91 |= cfr_renamed_4;
    }

    public sprtpe cfr_renamed_2573() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_4727() {
        return this.cfr_renamed_1.cfr_renamed_4727();
    }
}

