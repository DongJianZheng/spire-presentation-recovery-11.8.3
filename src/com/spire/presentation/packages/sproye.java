/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraaf;
import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.spridf;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlmm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmip;
import com.spire.presentation.packages.sprmvm;
import com.spire.presentation.packages.sprnsm;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprwob;
import java.io.IOException;
import java.io.OutputStream;

public class sproye {
    private final spraaf cfr_renamed_3;
    private final sprmvm[] cfr_renamed_4;

    public void cfr_renamed_5376(sprjj arg0) throws sprlyl {
        this.cfr_renamed_3.cfr_renamed_5376(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_5377(sprjj arg0) throws sprlyl {
        sproye sproye2 = this;
        sprmvm sprmvm2 = sproye2.cfr_renamed_4[sproye2.cfr_renamed_4.length - 1];
        OutputStream outputStream = arg0.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(sprmvm2.cfr_renamed_104("DER"));
            outputStream2.close();
            return arg0.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprwob.cfr_renamed_9("%N#S0B)Y.\u0016#W,U5Z!B)X'\u0016(W3^z\u0016")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_3.cfr_renamed_678();
    }

    public sprqxe[] cfr_renamed_681() throws sprlyl {
        int n;
        sprqxe[] sprqxeArray = new sprqxe[this.cfr_renamed_4.length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            sproye sproye2 = this;
            int n3 = n++;
            sprqxeArray[n3] = sproye2.cfr_renamed_5378(sproye2.cfr_renamed_4[n3]);
            n2 = n;
        }
        return sprqxeArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqxe cfr_renamed_5378(sprmvm arg0) throws sprlyl {
        sprlvm sprlvm2 = arg0.cfr_renamed_652();
        try {
            return new sprqxe(sprlvm2);
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprmip.cfr_renamed_9("$\u000f0\u0003=\u0004q\u0015>A!\u0000#\u00124A%\u000e:\u0004?A5\u0000%\u0000kA")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (sprahf sprahf2) {
            if (!(sprahf2.getCause() instanceof sprlyl)) throw new sprlyl(new StringBuilder().insert(0, sprwob.cfr_renamed_9("4Y+S.\u0016$W4W`_.@!Z)Rz\u0016")).append(sprahf2.getMessage()).toString(), sprahf2);
            throw (sprlyl)sprahf2.getCause();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlyl(new StringBuilder().insert(0, sprmip.cfr_renamed_9("%\u000e:\u0004?A5\u0000%\u0000q\b?\u00170\r8\u0005kA")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprmvm[] cfr_renamed_676() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_675() {
        return this.cfr_renamed_3.cfr_renamed_675();
    }

    /*
     * WARNING - void declaration
     */
    public sproye(sprnsm sprnsm2) throws IOException {
        void arg0;
        sproye sproye2 = this;
        this.cfr_renamed_3 = new spraaf(arg0.cfr_renamed_683());
        this.cfr_renamed_4 = sprnsm2.cfr_renamed_684().cfr_renamed_685().cfr_renamed_686();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjj cfr_renamed_5379(sprlj arg0) throws sprhjg {
        try {
            sproye sproye2 = this;
            spridf spridf2 = sproye2.cfr_renamed_5378(sproye2.cfr_renamed_4[0]).cfr_renamed_577();
            sprlem sprlem2 = spridf2.cfr_renamed_591();
            sprjj sprjj2 = arg0.cfr_renamed_5279(new sprddm(sprlem2));
            sproye2.cfr_renamed_5376(sprjj2);
            return sprjj2;
        }
        catch (sprlyl sprlyl2) {
            throw new sprhjg(new StringBuilder().insert(0, sprwob.cfr_renamed_9("5X!T,S`B/\u0016%N4D!U4\u0016!Z'Y2_4^-\u0016\trz\u0016")).append(sprlyl2.getMessage()).toString(), sprlyl2);
        }
    }

    public sprjpm cfr_renamed_671() {
        return new sprjpm(this.cfr_renamed_3.cfr_renamed_671());
    }

    private /* synthetic */ void cfr_renamed_5380(sprqxe arg0, byte[] arg1) throws sprnxe {
        byte[] byArray = arg0.cfr_renamed_577().cfr_renamed_581();
        if (!sproze.cfr_renamed_92(arg1, byArray)) {
            throw new sprnxe(sprmip.cfr_renamed_9("9\u0000\"\tq\u00020\r2\u0014=\u0000%\u00045A8\u0012q\u00058\u00077\u0004#\u0004?\u0015q\u0007#\u000e<A\u001c\u0004\"\u00120\u00064(<\u0011#\b?\u0015\u0015\b6\u0004\"\u0015q\u0007>\u0014?\u0005q\b?A\u0005\b<\u0004\u0002\u00150\f!5>\n4\u000f"), arg0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_5381(sprlj arg0, byte[] arg1) throws sprnxe, sprlyl {
        int n;
        byte[] byArray = arg1;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            try {
                sproye sproye2 = this;
                sprqxe sprqxe2 = sproye2.cfr_renamed_5378(sproye2.cfr_renamed_4[n]);
                if (n > 0) {
                    spridf spridf2 = sprqxe2.cfr_renamed_577();
                    sprjj sprjj2 = arg0.cfr_renamed_5279(spridf2.cfr_renamed_579());
                    sprjj2.cfr_renamed_470().write(this.cfr_renamed_4[n - 1].cfr_renamed_104("DER"));
                    byArray = sprjj2.cfr_renamed_580();
                }
                this.cfr_renamed_5380(sprqxe2, byArray);
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprwob.cfr_renamed_9("%N#S0B)Y.\u0016#W,U5Z!B)X'\u0016(W3^z\u0016")).append(iOException.getMessage()).toString(), iOException);
            }
            catch (sprhjg sprhjg2) {
                throw new sprlyl(new StringBuilder().insert(0, sprmip.cfr_renamed_9("2\u0000?\u000f>\u0015q\u0002#\u00040\u00154A5\b6\u0004\"\u0015kA")).append(sprhjg2.getMessage()).toString(), sprhjg2);
            }
            n2 = ++n;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_5382(sprlj arg0, byte[] arg1, sprqxe arg2) throws sprnxe, sprlyl {
        int n;
        byte[] byArray;
        byte[] byArray2 = arg1;
        try {
            byArray = arg2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprwob.cfr_renamed_9("S8U%F4_/X`S.U/R)X'\u00164_-S\u0013B![0b/]%Xz\u0016")).append(iOException.getMessage()).toString(), iOException);
        }
        int n2 = n = 0;
        while (true) {
            if (n2 >= this.cfr_renamed_4.length) {
                throw new sprnxe(sprmip.cfr_renamed_9("!\u0000\"\u00124\u0005q\b?A%\u000e:\u0004?A?\u000e%A0\u0012\"\u000e2\b0\u00154\u0005q\u00168\u00159A%\b<\u0004\"\u00150\f!\u0012q\u0011#\u0004\"\u0004?\u0015"), arg2);
            }
            try {
                sproye sproye2 = this;
                sprqxe sprqxe2 = sproye2.cfr_renamed_5378(sproye2.cfr_renamed_4[n]);
                if (n > 0) {
                    spridf spridf2 = sprqxe2.cfr_renamed_577();
                    sprjj sprjj2 = arg0.cfr_renamed_5279(spridf2.cfr_renamed_579());
                    sprjj2.cfr_renamed_470().write(this.cfr_renamed_4[n - 1].cfr_renamed_104("DER"));
                    byArray2 = sprjj2.cfr_renamed_580();
                }
                this.cfr_renamed_5380(sprqxe2, byArray2);
                if (sproze.cfr_renamed_92(sprqxe2.cfr_renamed_91(), byArray)) {
                    return;
                }
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprmip.cfr_renamed_9("4\u00192\u0004!\u00158\u000e?A2\u0000=\u0002$\r0\u00158\u000f6A9\u0000\"\tkA")).append(iOException.getMessage()).toString(), iOException);
            }
            catch (sprhjg sprhjg2) {
                throw new sprlyl(new StringBuilder().insert(0, sprwob.cfr_renamed_9("#W.X/B`U2S!B%\u0016$_'S3Bz\u0016")).append(sprhjg2.getMessage()).toString(), sprhjg2);
            }
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sproye(sprlmm sprlmm2) {
        void arg0;
        sproye sproye2 = this;
        this.cfr_renamed_3 = new spraaf(arg0.cfr_renamed_683());
        this.cfr_renamed_4 = sprlmm2.cfr_renamed_684().cfr_renamed_685().cfr_renamed_686();
    }
}

