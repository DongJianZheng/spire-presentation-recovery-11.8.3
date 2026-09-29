/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmfa;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdne;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprgse;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlue;
import com.spire.presentation.packages.sprmmia;
import com.spire.presentation.packages.sprnqd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprsd;
import com.spire.presentation.packages.sprsxd;
import com.spire.presentation.packages.sprtne;
import com.spire.presentation.packages.spryvd;
import com.spire.presentation.packages.sprzle;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;

public class sprhsd {
    private sprzle cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhsd(sprzle sprzle2) {
        void arg0;
        if (sprzle2.cfr_renamed_4409().cfr_renamed_4410() == null) {
            throw new IllegalArgumentException(sprmmia.cfr_renamed_9("yI`OLqZcNg\tlFv\tr[m]gJvLf"));
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_4411(sprja arg0) throws spryvd {
        try {
            sprga sprga2 = arg0.cfr_renamed_578(this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410());
            sprhsd sprhsd2 = this;
            return sprhsd2.cfr_renamed_4412(sprhsd2.cfr_renamed_4.cfr_renamed_4413().cfr_renamed_81(), sprga2);
        }
        catch (Exception exception) {
            throw new spryvd(new StringBuilder().insert(0, sprcmfa.cfr_renamed_9("s\u001bg\u0017j\u0010&\u0001iUp\u0010t\u001c`\f&\u0006o\u0012h\u0014r\u0000t\u0010<U")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprcyd[] cfr_renamed_617() {
        int n;
        sprtne[] sprtneArray = this.cfr_renamed_4.cfr_renamed_4414();
        if (sprtneArray == null) {
            return new sprcyd[0];
        }
        sprcyd[] sprcydArray = new sprcyd[sprtneArray.length];
        int n2 = n = 0;
        while (n2 != sprtneArray.length) {
            int n3 = n;
            sprcyd sprcyd2 = new sprcyd(sprtneArray[n].cfr_renamed_4415());
            sprcydArray[n3] = sprcyd2;
            n2 = ++n;
        }
        return sprcydArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 3 ^ 2;
        int n4 = n2;
        int n5 = 5 << 4 ^ 3 << 1;
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

    public sprzle cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprlue cfr_renamed_2573() {
        return this.cfr_renamed_4.cfr_renamed_2573();
    }

    public boolean cfr_renamed_4416() {
        return this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410().cfr_renamed_593().equals(sprsd.cfr_renamed_79);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_4417(sprsxd arg0, char[] arg1) throws spryvd {
        if (!sprsd.cfr_renamed_79.equals(this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410().cfr_renamed_593())) {
            throw new spryvd(sprmmia.cfr_renamed_9("YpFvLa]kFl\tcEeFp@vAo\tlFv\toHa\t`HqLf"));
        }
        try {
            sprlre sprlre2;
            arg0.cfr_renamed_4332(sprgse.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410().cfr_renamed_284()));
            sprha sprha2 = arg0.cfr_renamed_1480(arg1);
            OutputStream outputStream = sprha2.cfr_renamed_470();
            sprlre sprlre3 = sprlre2 = new sprlre();
            sprlre3.cfr_renamed_49(this.cfr_renamed_4.cfr_renamed_4409());
            sprlre3.cfr_renamed_49(this.cfr_renamed_4.cfr_renamed_2573());
            outputStream.write(new sprpse(sprlre2).cfr_renamed_104("DER"));
            outputStream.close();
            return sprzra.cfr_renamed_92(sprha2.cfr_renamed_1472(), this.cfr_renamed_4.cfr_renamed_4413().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new spryvd(new StringBuilder().insert(0, sprcmfa.cfr_renamed_9("s\u001bg\u0017j\u0010&\u0001iUp\u0010t\u001c`\f&8G6<U")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhsd(sprnqd sprnqd2) {
        void arg0;
        if (!sprnqd2.cfr_renamed_4418()) {
            throw new IllegalArgumentException(sprmmia.cfr_renamed_9("yI`OLqZcNg\tlFv\tr[m]gJvLf"));
        }
        this.cfr_renamed_4 = arg0.cfr_renamed_568();
    }

    public sprdne cfr_renamed_4409() {
        return this.cfr_renamed_4.cfr_renamed_4409();
    }

    private /* synthetic */ boolean cfr_renamed_4412(byte[] arg0, sprga arg1) throws IOException {
        OutputStream outputStream;
        sprlre sprlre2 = new sprlre();
        sprga sprga2 = arg1;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_4.cfr_renamed_4409());
        sprlre3.cfr_renamed_49(this.cfr_renamed_4.cfr_renamed_2573());
        OutputStream outputStream2 = outputStream = sprga2.cfr_renamed_470();
        outputStream2.write(new sprpse(sprlre2).cfr_renamed_104("DER"));
        outputStream2.close();
        return sprga2.cfr_renamed_1435(arg0);
    }
}

