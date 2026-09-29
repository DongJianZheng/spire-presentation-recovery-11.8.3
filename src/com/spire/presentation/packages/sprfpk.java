/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafk;
import com.spire.presentation.packages.sprcnk;
import com.spire.presentation.packages.sprdok;
import com.spire.presentation.packages.sprgx;
import com.spire.presentation.packages.sprhp;
import com.spire.presentation.packages.sprijk;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlhca;
import com.spire.presentation.packages.sprojk;
import com.spire.presentation.packages.sprrhf;
import com.spire.presentation.packages.sprtjk;
import com.spire.presentation.packages.sprvnk;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class sprfpk {
    private static final Long cfr_renamed_102 = 0L;
    private Long cfr_renamed_93;
    private int cfr_renamed_86;
    private Long cfr_renamed_152;
    private final byte[] cfr_renamed_112;
    private InputStream cfr_renamed_119;
    private String cfr_renamed_91;
    private String cfr_renamed_0;
    private final sprhp cfr_renamed_1;
    private long cfr_renamed_2;
    private final sprijk cfr_renamed_3;
    private final sprvnk cfr_renamed_4;

    public static /* synthetic */ Long cfr_renamed_9789(sprfpk arg0) {
        return arg0.cfr_renamed_152;
    }

    public sprijk cfr_renamed_479() {
        return this.cfr_renamed_3;
    }

    public static /* synthetic */ long cfr_renamed_9790(sprfpk arg0) {
        return arg0.cfr_renamed_2;
    }

    public sprvnk cfr_renamed_9734() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_9766(String arg0) {
        return this.cfr_renamed_3.cfr_renamed_9791(arg0);
    }

    public String cfr_renamed_9733(String arg0) {
        return this.cfr_renamed_3.cfr_renamed_9787(arg0);
    }

    public sprhp cfr_renamed_9765() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_9732() {
        return this.cfr_renamed_86;
    }

    public String cfr_renamed_9792(char arg0) throws IOException {
        int n;
        int n2 = 0;
        do {
            sprfpk sprfpk2 = this;
            n = sprfpk2.cfr_renamed_119.read();
            sprfpk2.cfr_renamed_112[n2++] = (byte)n;
            if (n2 < this.cfr_renamed_112.length) continue;
            throw new IOException(new StringBuilder().insert(0, sprrhf.cfr_renamed_9("\u00001!\"6&s'6:'t?==1sjs")).append(this.cfr_renamed_112.length).toString());
        } while (n != arg0 && n > -1);
        if (n == -1) {
            throw new EOFException();
        }
        return new String(this.cfr_renamed_112, 0, n2).trim();
    }

    public static /* synthetic */ long cfr_renamed_9793(sprfpk arg0) {
        return arg0.cfr_renamed_2++;
    }

    public sprfpk(sprvnk arg0, sprhp arg1) throws IOException {
        sprfpk sprfpk2;
        Set<String> set;
        sprfpk sprfpk3 = this;
        sprfpk3.cfr_renamed_2 = 0L;
        sprfpk3.cfr_renamed_4 = arg0;
        this.cfr_renamed_1 = arg1;
        if (this.cfr_renamed_1 instanceof sprgx) {
            this.cfr_renamed_93 = ((sprgx)((Object)arg1)).cfr_renamed_9702();
        }
        if ((set = sprjcf.cfr_renamed_5160(sprlhca.cfr_renamed_9("\u00010\u000fq\u0011/\u000b-\u0007q\u0012,\u000f0\u0006:\u000eq\u0011:\u0001*\u00106\u0016&L;\u0007=\u00178L:\u0011+"))).contains(sprrhf.cfr_renamed_9("::#!'")) || set.contains("all")) {
            sprfpk2 = this;
            this.cfr_renamed_119 = new sprdok(arg1.cfr_renamed_2920(), null);
        } else {
            sprfpk2 = this;
            this.cfr_renamed_119 = arg1.cfr_renamed_2920();
        }
        sprfpk2.cfr_renamed_3 = new sprijk();
        this.cfr_renamed_112 = new byte[1024];
        this.cfr_renamed_9794();
    }

    public long cfr_renamed_9702() {
        if (this.cfr_renamed_93 == null) {
            return Long.MAX_VALUE;
        }
        return this.cfr_renamed_93;
    }

    public String cfr_renamed_9795() {
        return this.cfr_renamed_0;
    }

    public String cfr_renamed_9796() {
        return this.cfr_renamed_91;
    }

    public InputStream cfr_renamed_9797(InputStream arg0, Long arg1) {
        return new sprojk(this, arg0, arg1);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_9794() throws IOException {
        v0 = this;
        this.cfr_renamed_91 = this.cfr_renamed_9792(' ');
        this.cfr_renamed_86 = Integer.parseInt(this.cfr_renamed_9792(' '));
        v0.cfr_renamed_0 = v0.cfr_renamed_9792('\n');
        v1 = var1_1 = v0.cfr_renamed_9792('\n');
        while (v1.length() > 0) {
            var2_2 = var1_1.indexOf(58);
            if (var2_2 > -1) {
                var3_3 = sprkoe.cfr_renamed_425(var1_1.substring(0, var2_2).trim());
                this.cfr_renamed_3.cfr_renamed_9798(var3_3, var1_1.substring(var2_2 + 1).trim());
            }
            v1 = this.cfr_renamed_9792('\n');
        }
        var3_4 = this.cfr_renamed_3.cfr_renamed_9791(sprlhca.cfr_renamed_9("\u000b\u0010>\f,\u0004:\u0010r'1\u00010\u00066\f8")).equalsIgnoreCase(sprrhf.cfr_renamed_9("0<&:817"));
        if (var3_4) {
            v2 = this;
            this.cfr_renamed_152 = 0L;
        } else {
            v3 = this;
            v2 = v3;
            v3.cfr_renamed_152 = v3.cfr_renamed_9775();
        }
        if (v2.cfr_renamed_86 != 204 && this.cfr_renamed_86 != 202) ** GOTO lbl28
        if (this.cfr_renamed_152 == null) {
            this.cfr_renamed_152 = 0L;
            v4 = this;
        } else {
            if (this.cfr_renamed_86 == 204 && this.cfr_renamed_152 > 0L) {
                throw new IOException(sprlhca.cfr_renamed_9("\u0018\r+B\u00176\u000b2\u007f\u0011+\u0003+\u0017,BmRkB=\u0017+B\u001c\r1\u0016:\f+O3\u00071\u0005+\n\u007f\\\u007fRq"));
            }
lbl28:
            // 3 sources

            v4 = this;
        }
        if (v4.cfr_renamed_152 == null) {
            throw new IOException(sprrhf.cfr_renamed_9("\u001d;s\u0017<:'1= ~86:4 ;t;1206&}"));
        }
        if (this.cfr_renamed_152.equals(sprfpk.cfr_renamed_102) && !var3_4) {
            v5 = this;
            this.cfr_renamed_119 = new sprcnk(this);
        }
        if (this.cfr_renamed_152 < 0L) {
            throw new IOException(new StringBuilder().insert(0, sprlhca.cfr_renamed_9("\f\u0007-\u0014:\u0010\u007f\u0010:\u0016*\u00101\u0007;B1\u00078\u0003+\u000b)\u0007\u007f\u00010\f+\u00071\u0016\u007f\u000e:\f8\u00167X\u007f")).append(this.cfr_renamed_93).toString());
        }
        if (this.cfr_renamed_93 != null && this.cfr_renamed_152 >= this.cfr_renamed_93) {
            throw new IOException(new StringBuilder().insert(0, sprrhf.cfr_renamed_9("\u0017<:'1= s86:4 ;t?;=36&s ;5=t26 ;?!'1s&657t?=>='ns")).append(this.cfr_renamed_93).append(sprlhca.cfr_renamed_9("\u007f!0\f+\u00071\u0016r.:\f8\u00167X\u007f")).append(this.cfr_renamed_152).toString());
        }
        v6 = this;
        this.cfr_renamed_119 = v6.cfr_renamed_9797(this.cfr_renamed_119, v6.cfr_renamed_93);
        if (var3_4) {
            this.cfr_renamed_119 = new sprtjk(this.cfr_renamed_119);
        }
        if ("base64".equalsIgnoreCase(this.cfr_renamed_9733(sprrhf.cfr_renamed_9("0;= 6:'y'&2: 26&~1=7<0::4")))) {
            v7 = this;
            if (var3_4) {
                v7.cfr_renamed_119 = new sprafk(this.cfr_renamed_119);
                return;
            }
            v8 = this;
            v7.cfr_renamed_119 = new sprafk(v8.cfr_renamed_119, v8.cfr_renamed_152);
        }
    }

    public InputStream cfr_renamed_2920() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_2637() throws IOException {
        if (this.cfr_renamed_119 != null) {
            this.cfr_renamed_119.close();
        }
        this.cfr_renamed_1.cfr_renamed_2637();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Long cfr_renamed_9775() {
        String string = this.cfr_renamed_3.cfr_renamed_9787(sprlhca.cfr_renamed_9("!0\f+\u00071\u0016r.:\f8\u00167"));
        if (string == null) {
            return null;
        }
        try {
            return Long.parseLong(string);
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException(new StringBuilder().insert(0, sprrhf.cfr_renamed_9("\u0010;= 6:'t\u001f1=3'<itt")).append(string).append(sprlhca.cfr_renamed_9("xB6\f)\u00033\u000b;L\u007f")).append(runtimeException.getMessage()).toString());
        }
    }
}

