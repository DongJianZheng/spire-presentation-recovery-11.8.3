/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprevy;
import com.spire.presentation.packages.sprged;
import com.spire.presentation.packages.sprgkaa;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprynd;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;

public class spread
extends AlgorithmParameterGeneratorSpi {
    public SecureRandom cfr_renamed_2;
    public sprged cfr_renamed_3;
    public int cfr_renamed_4 = 1024;

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        if (arg0 < 512 || arg0 > 3072) {
            throw new InvalidParameterException(sprevy.cfr_renamed_9("N\u0014O\u0005S\u0007I\b\u001d\rH\u0013I@_\u0005\u001d\u0006O\u000fP@\bQ\u000f@\u0010@\u000eP\nR"));
        }
        if (arg0 <= 1024 && arg0 % 64 != 0) {
            throw new InvalidParameterException(sprgkaa.cfr_renamed_9("<[=J!H;GoB:\\;\u000f-JoNoB:C;F?C*\u000f Io\u0019{\u000f-J#@8\u000f~\u001f}\u001boM&[<\u0001"));
        }
        if (arg0 > 1024 && arg0 % 1024 != 0) {
            throw new InvalidParameterException(sprevy.cfr_renamed_9("N\u0014O\u0005S\u0007I\b\u001d\rH\u0013I@_\u0005\u001d\u0001\u001d\rH\fI\tM\fX@R\u0006\u001dQ\rR\t@\\\u0002R\u0016X@\fP\u000fT\u001d\u0002T\u0014NN"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = arg1;
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprgkaa.cfr_renamed_9("a \u000f<Z?_ ];J+\u000f\u000eC(@=F;G\"\u007f.].B*[*]\u001c_*LoI ]ok\u001cno_.].B*[*]oH*A*].[&@!\u0001"));
    }

    @Override
    public AlgorithmParameters engineGenerateParameters() {
        sprynd sprynd2;
        spread spread2;
        sprynd sprynd3;
        if (this.cfr_renamed_4 <= 1024) {
            sprynd3 = new sprynd();
            spread2 = this;
        } else {
            sprynd3 = new sprynd(new sprtfd());
            spread2 = this;
        }
        if (spread2.cfr_renamed_2 == null) {
            spread spread3 = this;
            spread3.cfr_renamed_2 = new SecureRandom();
        }
        if (this.cfr_renamed_4 == 1024) {
            sprynd sprynd4 = sprynd3;
            sprynd2 = sprynd4;
            this.cfr_renamed_3 = new sprged(1024, 160, 80, this.cfr_renamed_2);
            sprynd4.cfr_renamed_2517(this.cfr_renamed_3);
        } else if (this.cfr_renamed_4 > 1024) {
            sprynd sprynd5 = sprynd3;
            sprynd2 = sprynd5;
            this.cfr_renamed_3 = new sprged(this.cfr_renamed_4, 256, 80, this.cfr_renamed_2);
            sprynd5.cfr_renamed_2517(this.cfr_renamed_3);
        } else {
            sprynd sprynd6 = sprynd3;
            sprynd2 = sprynd6;
            sprynd6.cfr_renamed_2492(this.cfr_renamed_4, 20, this.cfr_renamed_2);
        }
        sprcld sprcld2 = sprynd2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("DSA", "BC");
            algorithmParameters.init(new DSAParameterSpec(sprcld2.cfr_renamed_1155(), sprcld2.cfr_renamed_1604(), sprcld2.cfr_renamed_1145()));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}

