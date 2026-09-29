/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbie;
import com.spire.presentation.packages.sprbke;
import com.spire.presentation.packages.sprbna;
import com.spire.presentation.packages.sprcee;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spreva;
import com.spire.presentation.packages.sprfsd;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhsa;
import com.spire.presentation.packages.sprlee;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprncs;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sproae;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprpua;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprsrd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Date;

public class sprbva {
    public sprhsa cfr_renamed_0;
    public sprfud cfr_renamed_1;
    public sprpod cfr_renamed_2;
    public Date cfr_renamed_3;
    public sprbna cfr_renamed_4;

    public spro cfr_renamed_617() {
        return this.cfr_renamed_1.cfr_renamed_617();
    }

    public sprhsa cfr_renamed_577() {
        return this.cfr_renamed_0;
    }

    public spro cfr_renamed_618() {
        return this.cfr_renamed_1.cfr_renamed_618();
    }

    public sprvte cfr_renamed_619() {
        return this.cfr_renamed_2.cfr_renamed_619();
    }

    public sprvte cfr_renamed_574() {
        return this.cfr_renamed_2.cfr_renamed_574();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbva(sprfud sprfud2) throws sprrua, IOException {
        sprbva sprbva2 = this;
        sprbva2.cfr_renamed_1 = sprfud2;
        if (!sprbva2.cfr_renamed_1.cfr_renamed_620().equals(sprm.cfr_renamed_93.cfr_renamed_19())) {
            throw new spreva(sproqr.cfr_renamed_9(",\n\u0001\u0011\n\u000b\u001b,\u0001\u0003\u0000E\u0000\u0007\u0005\u0000\f\u0011O\u000b\u0000\u0011O\u0003\u0000\u0017O\u0004O\u0011\u0006\b\nE\u001c\u0011\u000e\b\u001fK"));
        }
        Collection collection = this.cfr_renamed_1.cfr_renamed_621().cfr_renamed_622();
        if (collection.size() != 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprncs.cfr_renamed_9("\u0003\u0010:\u001cz\n#\u0018:\tw\r8\u00122\u0017w\n>\u001e9\u001c3Y5\u0000w")).append(collection.size()).append(sproqr.cfr_renamed_9("E\u001c\f\b\u000b\n\u0017\u001cIO\u0007\u001a\u0011O\f\u001bE\u0002\u0010\u001c\u0011O\u0006\u0000\u000b\u001b\u0004\u0006\u000bO\u000f\u001a\u0016\u001bE\u001b\r\nE;6.E\u001c\f\b\u000b\u000e\u0011\u001a\u0017\nK")).toString());
        }
        this.cfr_renamed_2 = (sprpod)collection.iterator().next();
        try {
            sprbva sprbva3 = this;
            sprql sprql2 = sprbva3.cfr_renamed_1.cfr_renamed_623();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprql2.cfr_renamed_624(byteArrayOutputStream);
            sprgle sprgle2 = new sprgle(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            sprbva sprbva4 = this;
            sprbva4.cfr_renamed_0 = new sprhsa(sproae.cfr_renamed_23(sprgle2.cfr_renamed_24()));
            sprche sprche2 = sprbva3.cfr_renamed_2.cfr_renamed_619().cfr_renamed_625(sprm.cfr_renamed_105);
            if (sprche2 != null) {
                sprbke sprbke2 = sprbke.cfr_renamed_23(sprche2.cfr_renamed_206().cfr_renamed_85(0));
                this.cfr_renamed_4 = new sprbna(this, sprlee.cfr_renamed_23(sprbke2.cfr_renamed_626()[0]));
                return;
            }
            sprche2 = this.cfr_renamed_2.cfr_renamed_619().cfr_renamed_625(sprm.cfr_renamed_3);
            if (sprche2 == null) {
                throw new spreva(sprncs.cfr_renamed_9("9\u0016w\n>\u001e9\u00109\u001ew\u001a2\u000b#\u00101\u00104\u0018#\u001cw\u0018#\r%\u00105\f#\u001cw\u001f8\f9\u001d{Y#\u0010:\u001cw\n#\u0018:\tw\u00109\u000f6\u0015>\u001dy"));
            }
            sprcee sprcee2 = sprcee.cfr_renamed_23(sprche2.cfr_renamed_206().cfr_renamed_85(0));
            this.cfr_renamed_4 = new sprbna(this, sprbie.cfr_renamed_23(sprcee2.cfr_renamed_626()[0]));
            return;
        }
        catch (sprlqd sprlqd2) {
            throw new sprrua(sprlqd2.getMessage(), sprlqd2.cfr_renamed_584());
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 2;
        int cfr_ignored_0 = 4 << 4 ^ 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public void cfr_renamed_627(sprfsd arg0) throws sprrua, spreva {
        if (!arg0.cfr_renamed_613()) {
            throw new IllegalArgumentException(sproqr.cfr_renamed_9("\u0013\n\u0017\u0006\u0003\u0006\u0000\u001dE\u001f\u0017\u0000\u0013\u0006\u0001\n\u0017O\u000b\n\u0000\u000b\u0016O\u0004\u0001E\u000e\u0016\u001c\n\f\f\u000e\u0011\n\u0001O\u0006\n\u0017\u001b\f\t\f\f\u0004\u001b\u0000"));
        }
        try {
            OutputStream outputStream;
            sprfsd sprfsd2 = arg0;
            sprcyd sprcyd2 = sprfsd2.cfr_renamed_614();
            sprpa sprpa2 = sprfsd2.cfr_renamed_628(this.cfr_renamed_4.cfr_renamed_579());
            OutputStream outputStream2 = outputStream = sprpa2.cfr_renamed_470();
            outputStream2.write(sprcyd2.cfr_renamed_91());
            outputStream2.close();
            if (!sprzra.cfr_renamed_559(this.cfr_renamed_4.cfr_renamed_629(), sprpa2.cfr_renamed_580())) {
                throw new spreva(sprncs.cfr_renamed_9("\u001a2\u000b#\u00101\u00104\u0018#\u001cw\u00116\n?Y3\u00162\nw\u00178\rw\u00146\r4\u0011w\u001a2\u000b#0\u0013Y?\u0018$\u0011y"));
            }
            if (this.cfr_renamed_4.cfr_renamed_630() != null) {
                boolean bl;
                block14: {
                    int n;
                    sprvre sprvre2 = new sprvre(sprcyd2.cfr_renamed_568());
                    if (!this.cfr_renamed_4.cfr_renamed_630().cfr_renamed_405().equals(sprvre2.cfr_renamed_114())) {
                        throw new spreva(sproqr.cfr_renamed_9("\f\u0000\u001d\u0011\u0006\u0003\u0006\u0006\u000e\u0011\nE\u001c\u0000\u001d\f\u000e\tO\u000b\u001a\b\r\u0000\u001dE\u000b\n\n\u0016O\u000b\u0000\u0011O\b\u000e\u0011\f\rO\u0006\n\u0017\u001b,+E\t\n\u001dE\u001c\f\b\u000b\u000e\u0011\u001a\u0017\nK"));
                    }
                    sprmee[] sprmeeArray = this.cfr_renamed_4.cfr_renamed_630().cfr_renamed_102().cfr_renamed_289();
                    boolean bl2 = false;
                    int n2 = n = 0;
                    while (n2 != sprmeeArray.length) {
                        if (sprmeeArray[n].cfr_renamed_312() == 4 && spruhe.cfr_renamed_23(sprmeeArray[n].cfr_renamed_313()).equals(spruhe.cfr_renamed_23(sprvre2.cfr_renamed_313()))) {
                            bl = bl2 = true;
                            break block14;
                        }
                        n2 = ++n;
                    }
                    bl = bl2;
                }
                if (!bl) {
                    throw new spreva(sprncs.cfr_renamed_9("\u001a2\u000b#\u00101\u00104\u0018#\u001cw\u00176\u00142Y3\u00162\nw\u00178\rw\u00146\r4\u0011w\u001a2\u000b#0\u0013Y1\u0016%Y$\u00100\u00176\r\"\u000b2Ww"));
                }
            }
            sprpua.cfr_renamed_567(sprcyd2);
            if (!sprcyd2.cfr_renamed_631(this.cfr_renamed_0.cfr_renamed_588())) {
                throw new spreva(sproqr.cfr_renamed_9("\f\u0000\u001d\u0011\u0006\u0003\u0006\u0006\u000e\u0011\nE\u0001\n\u001bE\u0019\u0004\u0003\f\u000bE\u0018\r\n\u000bO\u0011\u0006\b\nE\u001c\u0011\u000e\b\u001fE\f\u0017\n\u0004\u001b\u0000\u000bK"));
            }
            if (!this.cfr_renamed_2.cfr_renamed_632(arg0)) {
                throw new spreva(sprncs.cfr_renamed_9("$\u00100\u00176\r\"\u000b2Y9\u0016#Y4\u000b2\u0018#\u001c3Y5\u0000w\u001a2\u000b#\u00101\u00104\u0018#\u001cy"));
            }
        }
        catch (sprlqd sprlqd2) {
            if (sprlqd2.cfr_renamed_584() != null) {
                throw new sprrua(sprlqd2.getMessage(), sprlqd2.cfr_renamed_584());
            }
            throw new sprrua(new StringBuilder().insert(0, sproqr.cfr_renamed_9("&\"6O\u0000\u0017\u0006\n\u0015\u001b\f\u0000\u000bUE")).append(sprlqd2).toString(), sprlqd2);
        }
        catch (IOException iOException) {
            throw new sprrua(new StringBuilder().insert(0, sprncs.cfr_renamed_9("\t%\u00165\u00152\u0014w\t%\u00164\u001c$\n>\u00170Y4\u001c%\r>\u001f>\u001a6\r2Cw")).append(iOException).toString(), iOException);
        }
        catch (sprfya sprfya2) {
            throw new sprrua(new StringBuilder().insert(0, sproqr.cfr_renamed_9("\u0010\u0001\u0004\r\t\nE\u001b\nO\u0006\u001d\u0000\u000e\u0011\nE\u000b\f\b\u0000\u001c\u0011UE")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
    }

    public spro cfr_renamed_633() {
        return this.cfr_renamed_1.cfr_renamed_633();
    }

    public sprsrd cfr_renamed_634() {
        return this.cfr_renamed_2.cfr_renamed_634();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprfud cfr_renamed_635(sprnte arg0) throws sprrua {
        try {
            return new sprfud(arg0);
        }
        catch (sprlqd sprlqd2) {
            throw new sprrua(new StringBuilder().insert(0, sprncs.cfr_renamed_9("\u0003*\u0007Y'\u0018%\n>\u00170Y2\u000b%\u0016%Cw")).append(sprlqd2.getMessage()).toString(), sprlqd2.getCause());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_636(sprfsd arg0) throws sprrua {
        try {
            return this.cfr_renamed_2.cfr_renamed_632(arg0);
        }
        catch (sprlqd sprlqd2) {
            if (sprlqd2.cfr_renamed_584() != null) {
                throw new sprrua(sprlqd2.getMessage(), sprlqd2.cfr_renamed_584());
            }
            throw new sprrua(new StringBuilder().insert(0, sproqr.cfr_renamed_9("&\"6O\u0000\u0017\u0006\n\u0015\u001b\f\u0000\u000bUE")).append(sprlqd2).toString(), sprlqd2);
        }
    }

    public sprbva(sprnte arg0) throws sprrua, IOException {
        this(sprbva.cfr_renamed_635(arg0));
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_91();
    }

    public sprfud cfr_renamed_637() {
        return this.cfr_renamed_1;
    }
}

