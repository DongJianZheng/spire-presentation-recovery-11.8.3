/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraada;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.spriu;
import com.spire.presentation.packages.sprlom;
import com.spire.presentation.packages.sprmom;
import com.spire.presentation.packages.sprqld;
import com.spire.presentation.packages.sprrtl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzmm;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzwl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprkrl {
    public static final int cfr_renamed_119 = 5;
    public static final int cfr_renamed_91 = 0;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 6;
    public static final int cfr_renamed_3 = 2;
    private sprmom cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprkrl(sprrzm arg0) throws IOException {
        try {
            this.cfr_renamed_4 = sprmom.cfr_renamed_23(arg0.cfr_renamed_24());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprqld.cfr_renamed_9("y\u0006x\u0001{\u0015y\u0002pGf\u0002g\u0017{\tg\u0002.G")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, spraada.cfr_renamed_9(".\\/[,O.X'\u001d1X0M,S0Xy\u001d")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (sprign sprign2) {
            throw new sprznl(new StringBuilder().insert(0, sprqld.cfr_renamed_9("y\u0006x\u0001{\u0015y\u0002pGf\u0002g\u0017{\tg\u0002.G")).append(sprign2.getMessage()).toString(), sprign2);
        }
        if (this.cfr_renamed_4 == null) {
            throw new sprznl(spraada.cfr_renamed_9(".\\/[,O.X'\u001d1X0M,S0Xy\u001d-RcO&N3R-N&\u001d'\\7\\c[,H-Y"));
        }
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprkrl)) {
            return false;
        }
        sprkrl sprkrl2 = (sprkrl)arg0;
        return this.cfr_renamed_4.equals(sprkrl2.cfr_renamed_4);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprkrl(sprmom sprmom2) {
        this.cfr_renamed_4 = sprmom2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 4 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 1 << 1;
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

    public sprmom cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_4284() throws sprzwl {
        sprlom sprlom2 = this.cfr_renamed_4.cfr_renamed_4285();
        if (sprlom2 == null) {
            return null;
        }
        if (!sprlom2.cfr_renamed_4286().cfr_renamed_5078(spriu.cfr_renamed_112)) {
            return sprlom2.cfr_renamed_3262();
        }
        try {
            sprxgf sprxgf2 = sprxgf.cfr_renamed_184(sprlom2.cfr_renamed_3262().cfr_renamed_186());
            return new sprrtl(sprzmm.cfr_renamed_23(sprxgf2));
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sprqld.cfr_renamed_9("\u0017f\bv\u000bq\n4\u0003q\u0004{\u0003}\tsG{\u0005~\u0002w\u0013.G")).append(exception).toString(), exception);
        }
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public int cfr_renamed_648() {
        return this.cfr_renamed_4.cfr_renamed_4115().cfr_renamed_9108();
    }

    /*
     * WARNING - void declaration
     */
    public sprkrl(InputStream inputStream) throws IOException {
        this(new sprrzm((InputStream)arg0));
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprkrl(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }
}

