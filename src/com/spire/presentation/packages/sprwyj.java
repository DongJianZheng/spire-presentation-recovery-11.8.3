/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdoha;
import com.spire.presentation.packages.sprfsj;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprnij;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprrsk;
import com.spire.presentation.packages.spruvk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprywj;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;

public class sprwyj
extends sprnij {
    public int cfr_renamed_2 = 2048;
    public sprrsk cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        if (arg0 < 512 || arg0 > 3072) {
            throw new InvalidParameterException(sprywj.cfr_renamed_9("o\u001en\u000fr\rh\u0002<\u0007i\u0019hJ~\u000f<\fn\u0005qJ)[.J1J/Z+X"));
        }
        if (arg0 <= 1024 && arg0 % 64 != 0) {
            throw new InvalidParameterException(sprdoha.cfr_renamed_9("Q\u0014P\u0005L\u0007V\b\u0002\rW\u0013V@@\u0005\u0002\u0001\u0002\rW\fV\tR\fG@M\u0006\u0002V\u0016@@\u0005N\u000fU@\u0013P\u0010T\u0002\u0002K\u0014QN"));
        }
        if (arg0 > 1024 && arg0 % 1024 != 0) {
            throw new InvalidParameterException(sprywj.cfr_renamed_9("o\u001en\u000fr\rh\u0002<\u0007i\u0019hJ~\u000f<\u000b<\u0007i\u0006h\u0003l\u0006yJs\f<[,X(J}\bs\u001cyJ-Z.^<\bu\u001eoD"));
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9(".M@Q\u0015R\u0010M\u0012V\u0005F@c\fE\u000fP\tV\bO0C\u0012C\rG\u0014G\u0012q\u0010G\u0003\u0002\u0006M\u0012\u0002$q!\u0002\u0010C\u0012C\rG\u0014G\u0012\u0002\u0007G\u000eG\u0012C\u0014K\u000fLN"));
    }

    @Override
    public AlgorithmParameters engineGenerateParameters() {
        spruvk spruvk2;
        sprwyj sprwyj2;
        spruvk spruvk3;
        if (this.cfr_renamed_2 <= 1024) {
            spruvk3 = new spruvk();
            sprwyj2 = this;
        } else {
            spruvk3 = new spruvk(sprohl.cfr_renamed_7529());
            sprwyj2 = this;
        }
        if (sprwyj2.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        }
        sprwyj sprwyj3 = this;
        int n = sprfsj.cfr_renamed_9372(sprwyj3.cfr_renamed_2);
        if (sprwyj3.cfr_renamed_2 == 1024) {
            spruvk spruvk4 = spruvk3;
            spruvk2 = spruvk4;
            sprwyj sprwyj4 = this;
            sprwyj4.cfr_renamed_3 = new sprrsk(1024, 160, n, this.cfr_renamed_4);
            spruvk4.cfr_renamed_9448(this.cfr_renamed_3);
        } else if (this.cfr_renamed_2 > 1024) {
            spruvk spruvk5 = spruvk3;
            spruvk2 = spruvk5;
            this.cfr_renamed_3 = new sprrsk(this.cfr_renamed_2, 256, n, this.cfr_renamed_4);
            spruvk5.cfr_renamed_9448(this.cfr_renamed_3);
        } else {
            spruvk spruvk6 = spruvk3;
            spruvk2 = spruvk6;
            spruvk6.cfr_renamed_2492(this.cfr_renamed_2, n, this.cfr_renamed_4);
        }
        sprmqk sprmqk2 = spruvk2.cfr_renamed_2493();
        try {
            AlgorithmParameters algorithmParameters = this.cfr_renamed_9250("DSA");
            algorithmParameters.init(new DSAParameterSpec(sprmqk2.cfr_renamed_1155(), sprmqk2.cfr_renamed_1604(), sprmqk2.cfr_renamed_1145()));
            return algorithmParameters;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}

