/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprbio;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprdve;
import com.spire.presentation.packages.sprdwe;
import com.spire.presentation.packages.spreta;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhsa;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjua;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmoo;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvpe;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;

public class sprpwa {
    private final sprdwe[] cfr_renamed_3;
    private final spreta cfr_renamed_4;

    public sprvte cfr_renamed_671() {
        return new sprvte(this.cfr_renamed_4.cfr_renamed_671());
    }

    private /* synthetic */ void cfr_renamed_672(sprbva arg0, byte[] arg1) throws sprjua {
        byte[] byArray = arg0.cfr_renamed_577().cfr_renamed_581();
        if (!sprzra.cfr_renamed_92(arg1, byArray)) {
            throw new sprjua(sprmoo.cfr_renamed_9("\u001dB\u0006KU@\u0014O\u0016V\u0019B\u0001F\u0011\u0003\u001cPUG\u001cE\u0013F\u0007F\u001bWUE\u0007L\u0018\u00038F\u0006P\u0014D\u0010j\u0018S\u0007J\u001bW1J\u0012F\u0006WUE\u001aV\u001bGUJ\u001b\u0003!J\u0018F&W\u0014N\u0005w\u001aH\u0010M"), arg0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_673(spraa arg0, byte[] arg1) throws sprjua, sprlqd {
        int n;
        byte[] byArray = arg1;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            try {
                sprpwa sprpwa2 = this;
                sprbva sprbva2 = sprpwa2.cfr_renamed_674(sprpwa2.cfr_renamed_3[n]);
                if (n > 0) {
                    sprhsa sprhsa2 = sprbva2.cfr_renamed_577();
                    sprpa sprpa2 = arg0.cfr_renamed_578(sprhsa2.cfr_renamed_579());
                    sprpa2.cfr_renamed_470().write(this.cfr_renamed_3[n - 1].cfr_renamed_104("DER"));
                    byArray = sprpa2.cfr_renamed_580();
                }
                this.cfr_renamed_672(sprbva2, byArray);
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sprbio.cfr_renamed_9("g\u0018a\u0005r\u0014k\u000fl@a\u0001n\u0003w\fc\u0014k\u000ee@j\u0001q\b8@")).append(iOException.getMessage()).toString(), iOException);
            }
            catch (sprfya sprfya2) {
                throw new sprlqd(new StringBuilder().insert(0, sprmoo.cfr_renamed_9("\u0016B\u001bM\u001aWU@\u0007F\u0014W\u0010\u0003\u0011J\u0012F\u0006WO\u0003")).append(sprfya2.getMessage()).toString(), sprfya2);
            }
            n2 = ++n;
        }
        return;
    }

    public String cfr_renamed_675() {
        return this.cfr_renamed_4.cfr_renamed_675();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbva cfr_renamed_674(sprdwe arg0) throws sprlqd {
        sprnte sprnte2 = arg0.cfr_renamed_652();
        try {
            return new sprbva(sprnte2);
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprbio.cfr_renamed_9("w\u000ec\u0002n\u0005\"\u0014m@r\u0001p\u0013g@v\u000fi\u0005l@f\u0001v\u00018@")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (sprrua sprrua2) {
            if (!(sprrua2.getCause() instanceof sprlqd)) throw new sprlqd(new StringBuilder().insert(0, sprmoo.cfr_renamed_9("\u0001L\u001eF\u001b\u0003\u0011B\u0001BUJ\u001bU\u0014O\u001cGO\u0003")).append(sprrua2.getMessage()).toString(), sprrua2);
            throw (sprlqd)sprrua2.getCause();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(new StringBuilder().insert(0, sprbio.cfr_renamed_9("v\u000fi\u0005l@f\u0001v\u0001\"\tl\u0016c\fk\u00048@")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprdwe[] cfr_renamed_676() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_677(sprpa arg0) throws sprlqd {
        this.cfr_renamed_4.cfr_renamed_677(arg0);
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_4.cfr_renamed_678();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_679(sprpa arg0) throws sprlqd {
        sprpwa sprpwa2 = this;
        sprdwe sprdwe2 = sprpwa2.cfr_renamed_3[sprpwa2.cfr_renamed_3.length - 1];
        OutputStream outputStream = arg0.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(sprdwe2.cfr_renamed_104("DER"));
            outputStream2.close();
            return arg0.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprmoo.cfr_renamed_9("\u0010[\u0016F\u0005W\u001cL\u001b\u0003\u0016B\u0019@\u0000O\u0014W\u001cM\u0012\u0003\u001dB\u0006KO\u0003")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpa cfr_renamed_680(spraa arg0) throws sprfya {
        try {
            sprpwa sprpwa2 = this;
            sprhsa sprhsa2 = sprpwa2.cfr_renamed_674(sprpwa2.cfr_renamed_3[0]).cfr_renamed_577();
            sprtzd sprtzd2 = sprhsa2.cfr_renamed_591();
            sprpa sprpa2 = arg0.cfr_renamed_578(new sprije(sprtzd2));
            sprpwa2.cfr_renamed_677(sprpa2);
            return sprpa2;
        }
        catch (sprlqd sprlqd2) {
            throw new sprfya(new StringBuilder().insert(0, sprbio.cfr_renamed_9("w\u000ec\u0002n\u0005\"\u0014m@g\u0018v\u0012c\u0003v@c\fe\u000fp\tv\bo@K$8@")).append(sprlqd2.getMessage()).toString(), sprlqd2);
        }
    }

    public sprbva[] cfr_renamed_681() throws sprlqd {
        int n;
        sprbva[] sprbvaArray = new sprbva[this.cfr_renamed_3.length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprpwa sprpwa2 = this;
            int n3 = n++;
            sprbvaArray[n3] = sprpwa2.cfr_renamed_674(sprpwa2.cfr_renamed_3[n3]);
            n2 = n;
        }
        return sprbvaArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_682(spraa arg0, byte[] arg1, sprbva arg2) throws sprjua, sprlqd {
        int n;
        byte[] byArray;
        byte[] byArray2 = arg1;
        try {
            byArray = arg2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprmoo.cfr_renamed_9("F\r@\u0010S\u0001J\u001aMUF\u001b@\u001aG\u001cM\u0012\u0003\u0001J\u0018F&W\u0014N\u0005w\u001aH\u0010MO\u0003")).append(iOException.getMessage()).toString(), iOException);
        }
        int n2 = n = 0;
        while (true) {
            if (n2 >= this.cfr_renamed_3.length) {
                throw new sprjua(sprbio.cfr_renamed_9("r\u0001q\u0013g\u0004\"\tl@v\u000fi\u0005l@l\u000fv@c\u0013q\u000fa\tc\u0014g\u0004\"\u0017k\u0014j@v\to\u0005q\u0014c\rr\u0013\"\u0010p\u0005q\u0005l\u0014"), arg2);
            }
            try {
                sprpwa sprpwa2 = this;
                sprbva sprbva2 = sprpwa2.cfr_renamed_674(sprpwa2.cfr_renamed_3[n]);
                if (n > 0) {
                    sprhsa sprhsa2 = sprbva2.cfr_renamed_577();
                    sprpa sprpa2 = arg0.cfr_renamed_578(sprhsa2.cfr_renamed_579());
                    sprpa2.cfr_renamed_470().write(this.cfr_renamed_3[n - 1].cfr_renamed_104("DER"));
                    byArray2 = sprpa2.cfr_renamed_580();
                }
                this.cfr_renamed_672(sprbva2, byArray2);
                if (sprzra.cfr_renamed_92(sprbva2.cfr_renamed_91(), byArray)) {
                    return;
                }
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sprbio.cfr_renamed_9("g\u0018a\u0005r\u0014k\u000fl@a\u0001n\u0003w\fc\u0014k\u000ee@j\u0001q\b8@")).append(iOException.getMessage()).toString(), iOException);
            }
            catch (sprfya sprfya2) {
                throw new sprlqd(new StringBuilder().insert(0, sprmoo.cfr_renamed_9("\u0016B\u001bM\u001aWU@\u0007F\u0014W\u0010\u0003\u0011J\u0012F\u0006WO\u0003")).append(sprfya2.getMessage()).toString(), sprfya2);
            }
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprpwa(sprdve sprdve2) {
        void arg0;
        sprpwa sprpwa2 = this;
        this.cfr_renamed_4 = new spreta(arg0.cfr_renamed_683());
        this.cfr_renamed_3 = sprdve2.cfr_renamed_684().cfr_renamed_685().cfr_renamed_686();
    }

    /*
     * WARNING - void declaration
     */
    public sprpwa(sprvpe sprvpe2) throws IOException {
        void arg0;
        sprpwa sprpwa2 = this;
        this.cfr_renamed_4 = new spreta(arg0.cfr_renamed_683());
        this.cfr_renamed_3 = sprvpe2.cfr_renamed_684().cfr_renamed_685().cfr_renamed_686();
    }
}

