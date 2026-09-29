/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravr;
import com.spire.presentation.packages.sprctg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgck;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprgjk;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprifg;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprlrg;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprqhk;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprsp;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzeh;
import java.io.IOException;
import java.io.OutputStream;

public class sprunk
implements sprsp {
    private final spryhk cfr_renamed_0;
    private final sprnzk cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public sprge cfr_renamed_576(int arg0) throws sprhjg {
        Object object;
        byte[] byArray;
        if (this.cfr_renamed_4 != arg0) {
            throw new sprhjg(new StringBuilder().insert(0, sprkki.cfr_renamed_9("\u0018!\u0000=\bs\u00196\u001d:\t:\n!O5\u0000!O2\u00034\u0000!\u0006'\u0007>Us")).append(arg0).toString());
        }
        sprpl sprpl2 = sprifg.cfr_renamed_3.cfr_renamed_5279(this.cfr_renamed_3);
        byte[] byArray2 = new byte[sprpl2.cfr_renamed_1218()];
        sprpl2.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        sprpl2.cfr_renamed_1219(byArray2, 0);
        byte[] byArray3 = this.cfr_renamed_0.cfr_renamed_102().cfr_renamed_8290() ? new byte[sprpl2.cfr_renamed_1218()] : (byArray = null);
        if (byArray != null) {
            Object object2 = object = (Object)sprrih.cfr_renamed_8165(this.cfr_renamed_0.cfr_renamed_568().cfr_renamed_8295(), sprlrg.cfr_renamed_135.cfr_renamed_1451());
            sprpl2.cfr_renamed_1197((byte[])object2, 0, ((Object)object2).length);
            sprpl2.cfr_renamed_1219(byArray, 0);
        }
        object = new sprqhk(this, sprpl2);
        return new sprgjk(this, (OutputStream)object, sprpl2, byArray, byArray2);
    }

    public sprunk(spryhk arg0) throws IOException {
        spryhk spryhk2 = arg0;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_2 = spryhk2.cfr_renamed_91();
        sprzeh sprzeh2 = spryhk2.cfr_renamed_568().cfr_renamed_8295().cfr_renamed_8242();
        if (sprzeh2.cfr_renamed_8233() instanceof sprctg) {
            sprctg sprctg2;
            sprctg sprctg3 = sprctg2 = sprctg.cfr_renamed_23(sprzeh2.cfr_renamed_8233());
            this.cfr_renamed_4 = sprctg3.cfr_renamed_8227();
            switch (sprctg3.cfr_renamed_8227()) {
                case 0: {
                    while (false) {
                    }
                    sprunk sprunk2 = this;
                    this.cfr_renamed_3 = new sprddm(sprwr.cfr_renamed_1226);
                    break;
                }
                case 1: {
                    sprunk sprunk2 = this;
                    this.cfr_renamed_3 = new sprddm(sprwr.cfr_renamed_1226);
                    break;
                }
                case 2: {
                    sprunk sprunk2 = this;
                    this.cfr_renamed_3 = new sprddm(sprwr.cfr_renamed_112);
                    break;
                }
                default: {
                    throw new IllegalStateException(spravr.cfr_renamed_9("L(R(V1WfR#@fM?I#"));
                }
            }
            sprunk2.cfr_renamed_1 = (sprnzk)new sprgck(sprctg2).cfr_renamed_1521();
            return;
        }
        throw new IllegalStateException(sprkki.cfr_renamed_9("=\u0000'O#\u001a1\u0003:\fs\u00196\u001d:\t:\f2\u001b:\u0000=O8\n*"));
    }

    public static /* synthetic */ sprddm cfr_renamed_9617(sprunk arg0) {
        return arg0.cfr_renamed_3;
    }

    @Override
    public spryhk cfr_renamed_614() {
        return this.cfr_renamed_0;
    }

    @Override
    public boolean cfr_renamed_613() {
        return this.cfr_renamed_0 != null;
    }

    public static /* synthetic */ sprnzk cfr_renamed_9618(sprunk arg0) {
        return arg0.cfr_renamed_1;
    }
}

