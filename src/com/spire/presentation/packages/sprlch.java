/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdjh;
import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprgeh;
import com.spire.presentation.packages.sprgj;
import com.spire.presentation.packages.spril;
import com.spire.presentation.packages.sprkfh;
import com.spire.presentation.packages.sprkg;
import com.spire.presentation.packages.sprnql;
import com.spire.presentation.packages.sprpgh;
import com.spire.presentation.packages.sprsh;
import com.spire.presentation.packages.sprxcja;
import com.spire.presentation.packages.sprze;
import java.io.IOException;
import java.io.InputStream;

public class sprlch
implements sprze {
    private final InputStream cfr_renamed_91;
    private final String cfr_renamed_0;
    private boolean cfr_renamed_1 = false;
    private final String cfr_renamed_2;
    private sprfhh cfr_renamed_3;
    private final sprsh cfr_renamed_4;

    public boolean cfr_renamed_8506() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprlch(sprsh sprsh2, sprfhh sprfhh2, InputStream inputStream) {
        void arg2;
        void arg0;
        void arg1;
        sprlch sprlch2;
        if (sprfhh2.cfr_renamed_8506()) {
            sprlch2 = this;
            this.cfr_renamed_1 = true;
            this.cfr_renamed_2 = arg1.cfr_renamed_8524();
        } else {
            sprlch2 = this;
            this.cfr_renamed_2 = null;
        }
        sprlch2.cfr_renamed_3 = arg1;
        sprlch sprlch3 = this;
        this.cfr_renamed_4 = arg0;
        sprlch3.cfr_renamed_91 = arg2;
        sprlch3.cfr_renamed_0 = arg0 != null ? arg0.cfr_renamed_8508() : "7bit";
    }

    public sprlch(sprfhh arg0, InputStream arg1) {
        this(null, arg0, arg1);
    }

    public sprlch(sprsh arg0, InputStream arg1) throws IOException {
        this(arg0, new sprfhh(arg1, arg0.cfr_renamed_8508()), arg1);
    }

    public sprlch(InputStream arg0) throws IOException {
        this(null, new sprfhh(arg0, "7bit"), arg0);
    }

    @Override
    public void cfr_renamed_8519(sprgj arg0) throws IOException {
        sprlch sprlch2 = this;
        spril spril2 = arg0.cfr_renamed_8505(sprlch2.cfr_renamed_4, sprlch2.cfr_renamed_3);
        if (this.cfr_renamed_1) {
            String string;
            sprkg sprkg2 = (sprkg)spril2;
            String string2 = new StringBuilder().insert(0, sprnql.cfr_renamed_9("k/")).append(this.cfr_renamed_2).toString();
            boolean bl = false;
            int n = 0;
            sprkfh sprkfh2 = new sprkfh(this.cfr_renamed_91);
            while ((string = sprkfh2.cfr_renamed_8520()) != null && !sprxcja.cfr_renamed_9(",g").equals(string)) {
                spril spril3;
                sprfhh sprfhh2;
                InputStream inputStream;
                if (bl) {
                    sprlch sprlch3 = this;
                    inputStream = new sprpgh(sprlch3.cfr_renamed_91, sprlch3.cfr_renamed_2);
                    sprfhh2 = new sprfhh(inputStream, this.cfr_renamed_0);
                    spril3 = sprkg2.cfr_renamed_8510(n);
                    ++n;
                    inputStream = spril3.cfr_renamed_8512(sprfhh2, inputStream);
                    sprfhh sprfhh3 = sprfhh2;
                    arg0.cfr_renamed_8503(this.cfr_renamed_4, sprfhh3, this.cfr_renamed_8533(sprfhh3, inputStream));
                    if (((InputStream)inputStream).read() < 0) continue;
                    throw new IOException(sprnql.cfr_renamed_9("O\u000fO\u0003\")`,g%vfl)vfd3n*{fr4m%g5q#f"));
                }
                if (!string2.equals(string)) continue;
                bl = true;
                sprlch sprlch4 = this;
                inputStream = new sprpgh(sprlch4.cfr_renamed_91, sprlch4.cfr_renamed_2);
                sprfhh2 = new sprfhh(inputStream, this.cfr_renamed_0);
                spril3 = sprkg2.cfr_renamed_8510(n);
                ++n;
                inputStream = spril3.cfr_renamed_8512(sprfhh2, inputStream);
                sprfhh sprfhh4 = sprfhh2;
                arg0.cfr_renamed_8503(this.cfr_renamed_4, sprfhh4, this.cfr_renamed_8533(sprfhh4, inputStream));
                if (((InputStream)inputStream).read() < 0) continue;
                throw new IOException(sprxcja.cfr_renamed_9("\u0007H\u0007Djn(k/b>!$n>!,t&m3!:s%b/r9d."));
            }
        } else {
            sprlch sprlch5 = this;
            InputStream inputStream = spril2.cfr_renamed_8512(sprlch5.cfr_renamed_3, sprlch5.cfr_renamed_91);
            sprlch sprlch6 = this;
            sprlch sprlch7 = this;
            arg0.cfr_renamed_8503(sprlch6.cfr_renamed_4, sprlch6.cfr_renamed_3, sprlch7.cfr_renamed_8533(sprlch7.cfr_renamed_3, inputStream));
        }
    }

    private /* synthetic */ InputStream cfr_renamed_8533(sprfhh arg0, InputStream arg1) {
        if (arg0.cfr_renamed_8527().equals("base64")) {
            return new sprdjh(arg1);
        }
        if (arg0.cfr_renamed_8527().equals(sprnql.cfr_renamed_9("7w)v#fkr4k(v'`*g"))) {
            return new sprgeh(arg1);
        }
        return arg1;
    }
}

