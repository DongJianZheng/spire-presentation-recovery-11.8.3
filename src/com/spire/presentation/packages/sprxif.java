/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpf;
import com.spire.presentation.packages.spreyf;
import com.spire.presentation.packages.sprivf;
import com.spire.presentation.packages.sprkdg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprncf;
import com.spire.presentation.packages.spropca;
import com.spire.presentation.packages.sprozf;
import com.spire.presentation.packages.sprpmf;
import com.spire.presentation.packages.sprpzf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.pdf.security.PdfSecurity;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprxif
extends KeyPairGenerator {
    public sprpzf cfr_renamed_91;
    public SecureRandom cfr_renamed_0;
    public boolean cfr_renamed_1;
    private static Map cfr_renamed_2 = new HashMap();
    public spreyf cfr_renamed_3;
    private final sprivf cfr_renamed_4;

    static {
        cfr_renamed_2.put(sprncf.cfr_renamed_0.cfr_renamed_313(), sprivf.cfr_renamed_119);
        cfr_renamed_2.put(sprncf.cfr_renamed_1.cfr_renamed_313(), sprivf.cfr_renamed_93);
        cfr_renamed_2.put(sprncf.cfr_renamed_3.cfr_renamed_313(), sprivf.cfr_renamed_86);
        cfr_renamed_2.put(sprncf.cfr_renamed_91.cfr_renamed_313(), sprivf.cfr_renamed_96);
        cfr_renamed_2.put(sprncf.cfr_renamed_2.cfr_renamed_313(), sprivf.cfr_renamed_91);
        cfr_renamed_2.put(sprncf.cfr_renamed_119.cfr_renamed_313(), sprivf.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprxif(sprivf sprivf2) {
        void arg0;
        sprxif sprxif2 = this;
        super(arg0.cfr_renamed_313());
        sprxif sprxif3 = this;
        this.cfr_renamed_3 = new spreyf();
        sprxif3.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprxif2.cfr_renamed_1 = false;
        sprxif2.cfr_renamed_4 = sprivf2;
    }

    public sprxif() {
        sprxif sprxif2 = this;
        super(spropca.cfr_renamed_9("#\u001a8\u00153\u0014&"));
        sprxif sprxif3 = this;
        this.cfr_renamed_3 = new spreyf();
        sprxif3.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprxif2.cfr_renamed_1 = false;
        sprxif2.cfr_renamed_4 = null;
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprncf) {
            return ((sprncf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_1) {
            sprxif sprxif2;
            if (this.cfr_renamed_4 != null) {
                sprxif2 = this;
                sprxif sprxif3 = this;
                this.cfr_renamed_91 = new sprpzf(sprxif3.cfr_renamed_0, sprxif3.cfr_renamed_4);
            } else {
                sprxif2 = this;
                this.cfr_renamed_91 = new sprpzf(this.cfr_renamed_0, sprivf.cfr_renamed_119);
            }
            sprxif2.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_91);
            this.cfr_renamed_1 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_3.cfr_renamed_1223();
        sprkdg sprkdg2 = (sprkdg)sprsil2.cfr_renamed_1224();
        sprozf sprozf2 = (sprozf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprpmf(sprkdg2), new sprcpf(sprozf2));
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(PdfSecurity.cfr_renamed_9("\u0012\u0004\u0002W&\u001b\u0000\u0018\u0015\u001e\u0013\u001f\n'\u0006\u0005\u0006\u001a\u0002\u0003\u0002\u00054\u0007\u0002\u0014"));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprxif.cfr_renamed_5681(arg0);
        if (string != null && cfr_renamed_2.containsKey(string)) {
            sprivf sprivf2 = (sprivf)cfr_renamed_2.get(string);
            this.cfr_renamed_91 = new sprpzf(arg1, sprivf2);
            if (this.cfr_renamed_4 != null && !sprivf2.cfr_renamed_313().equals(this.cfr_renamed_4.cfr_renamed_313())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, spropca.cfr_renamed_9("\u001a>\b{\u0001:\u0018)Q<\u00145\u0014)\u0010/\u001e)Q7\u001e8\u001a>\u0015{\u00054Q")).append(sprkoe.cfr_renamed_116(this.cfr_renamed_4.cfr_renamed_313())).toString());
            }
            sprxif sprxif2 = this;
            sprxif2.cfr_renamed_3.cfr_renamed_5536(sprxif2.cfr_renamed_91);
            this.cfr_renamed_1 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, PdfSecurity.cfr_renamed_9("\u001e\t\u0001\u0006\u001b\u000e\u0013G'\u0006\u0005\u0006\u001a\u0002\u0003\u0002\u00054\u0007\u0002\u0014]W")).append(arg0).toString());
    }
}

