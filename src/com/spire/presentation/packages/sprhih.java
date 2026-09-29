/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyl;
import com.spire.presentation.packages.sprcch;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprgj;
import com.spire.presentation.packages.spril;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmul;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprnrl;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprsh;
import com.spire.presentation.packages.sprshh;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprygh;
import com.spire.presentation.packages.sprywl;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public abstract class sprhih
implements sprgj {
    private sprjj[] cfr_renamed_3;
    private sprshh cfr_renamed_4;

    public void cfr_renamed_8501(sprsh arg0, sprfhh arg1, InputStream arg2) throws IOException {
        throw new IllegalStateException(spregm.cfr_renamed_9("18<#79&w:6<3>><0r9=#r>?'>2?2<#73"));
    }

    public void cfr_renamed_8502(sprsh arg0, sprfhh arg1, sprnpl arg2, sprbyl arg3) throws IOException, sprlyl {
        throw new IllegalStateException(sprpfm.cfr_renamed_9("~2m9w3k9\u007f\u0018z(z|s=u8w5u;;2t(;5v,w9v9u(~8"));
    }

    @Override
    public void cfr_renamed_8503(sprsh arg0, sprfhh arg1, InputStream arg2) throws IOException {
        try {
            if (arg1.cfr_renamed_696().equals(spregm.cfr_renamed_9("6\"'>>16&>=9}'94!`\u007f$;0<6&\" 2")) || arg1.cfr_renamed_696().equals(sprpfm.cfr_renamed_9("=k,w5x=o5t24$6,p?hk6/r;u=o)i9"))) {
                int n;
                HashMap<sprlem, byte[]> hashMap = new HashMap<sprlem, byte[]>();
                int n2 = n = 0;
                while (n2 != this.cfr_renamed_3.length) {
                    sprhih sprhih2 = this;
                    sprhih2.cfr_renamed_3[n].cfr_renamed_470().close();
                    hashMap.put(sprhih2.cfr_renamed_3[n].cfr_renamed_615().cfr_renamed_593(), this.cfr_renamed_3[n++].cfr_renamed_580());
                    n2 = n;
                }
                byte[] byArray = sprkqe.cfr_renamed_471(arg2);
                sprywl sprywl2 = new sprywl(hashMap, byArray);
                this.cfr_renamed_8504(arg0, arg1, sprywl2.cfr_renamed_617(), sprywl2.cfr_renamed_633(), sprywl2.cfr_renamed_618(), sprywl2.cfr_renamed_621());
                return;
            }
            if (arg1.cfr_renamed_696().equals(spregm.cfr_renamed_9("3'\";;43#;8<x\"<1$ez?>?2")) || arg1.cfr_renamed_696().equals(sprpfm.cfr_renamed_9("z,k0r?z(r3uscqk7x/,qv5v9"))) {
                sprnrl sprnrl2 = new sprnrl(arg2);
                this.cfr_renamed_8502(arg0, arg1, sprnrl2.cfr_renamed_4170(), sprnrl2.cfr_renamed_4171());
                sprnrl2.cfr_renamed_2637();
                return;
            }
            this.cfr_renamed_8501(arg0, arg1, arg2);
            return;
        }
        catch (sprlyl sprlyl2) {
            throw new sprcch(new StringBuilder().insert(0, spregm.cfr_renamed_9("\u0014\u001f\u0004r13>>\" 2hw")).append(sprlyl2.getMessage()).toString(), sprlyl2);
        }
    }

    @Override
    public spril cfr_renamed_8505(sprsh arg0, sprfhh arg1) {
        if (arg1.cfr_renamed_8506()) {
            this.cfr_renamed_4 = new sprshh(arg0, arg1);
            this.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_8507();
            return this.cfr_renamed_4;
        }
        return new sprygh();
    }

    public void cfr_renamed_8504(sprsh arg0, sprfhh arg1, sprug arg2, sprug arg3, sprug arg4, sprmul arg5) throws IOException, sprlyl {
        throw new IllegalStateException(sprpfm.cfr_renamed_9("/r;u9\u007f\u0018z(z|s=u8w5u;;2t(;5v,w9v9u(~8"));
    }
}

