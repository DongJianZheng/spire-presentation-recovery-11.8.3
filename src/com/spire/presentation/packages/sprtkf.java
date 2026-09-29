/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprag;
import com.spire.presentation.packages.sprcrf;
import com.spire.presentation.packages.sprdpf;
import com.spire.presentation.packages.sprdrda;
import com.spire.presentation.packages.spreml;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprjig;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprlk;
import com.spire.presentation.packages.sprnkf;
import com.spire.presentation.packages.sprvcg;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class sprtkf
extends Signature {
    private SecureRandom cfr_renamed_0;
    private sprgm cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private sprlk cfr_renamed_3;
    private sprag cfr_renamed_4;

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3489();
        }
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprgf cfr_renamed_3489() throws SignatureException {
        try {
            return this.cfr_renamed_3.cfr_renamed_5709();
        }
        catch (sprjig sprjig2) {
            throw new SignatureException(sprjig2.getMessage(), sprjig2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtkf(String string, sprgf sprgf2) {
        super((String)arg0);
        void arg0;
        this.cfr_renamed_2 = sprgf2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_0 = arg1;
        this.engineInitSign(privateKey);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprlfg.cfr_renamed_9("\u0017l\u0015k\u001cg!g\u0006R\u0013p\u0013o\u0017v\u0017pRw\u001cq\u0007r\u0002m\u0000v\u0017f"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3489();
        }
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprdrda.cfr_renamed_9("\f}\u000ez\u0007v:v\u001dC\ba\b~\fg\faIf\u0007`\u001cc\u0019|\u001bg\fw"));
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprtkf sprtkf2 = this;
        sprvcg sprvcg2 = sprtkf2.cfr_renamed_4.cfr_renamed_5710(arg0);
        byte[] byArray = sprnkf.cfr_renamed_5652(sprtkf2.cfr_renamed_2);
        sprvcg2.cfr_renamed_1197(byArray, 0, byArray.length);
        return this.cfr_renamed_4.cfr_renamed_5711(sprvcg2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprlfg.cfr_renamed_9("\u0017l\u0015k\u001cg!g\u0006R\u0013p\u0013o\u0017v\u0017pRw\u001cq\u0007r\u0002m\u0000v\u0017f"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_3489();
        }
        try {
            sprtkf sprtkf2 = this;
            byte[] byArray = sprtkf2.cfr_renamed_3.cfr_renamed_5712((sprvcg)sprtkf2.cfr_renamed_2);
            this.cfr_renamed_2 = null;
            return byArray;
        }
        catch (Exception exception) {
            if (exception instanceof IllegalStateException) {
                throw new SignatureException(exception.getMessage(), exception);
            }
            throw new SignatureException(exception.toString(), exception);
        }
    }

    public sprtkf(String arg0) {
        super(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprcrf) {
            this.cfr_renamed_3 = (sprlk)((Object)((sprcrf)arg0).cfr_renamed_5650());
            if (this.cfr_renamed_3.cfr_renamed_5649() == 0L) {
                throw new InvalidKeyException(sprdrda.cfr_renamed_9("c\u001bz\u001fr\u001dvIx\fjIv\u0011{\bf\u001ag\fw"));
            }
            this.cfr_renamed_2 = null;
            return;
        }
        throw new InvalidKeyException(sprlfg.cfr_renamed_9("w\u001ci\u001cm\u0005lRr\u0000k\u0004c\u0006gRi\u0017{Rr\u0013q\u0001g\u0016\"\u0006mRN?Q"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprdpf) {
            sprtkf sprtkf2 = this;
            this.cfr_renamed_2 = new spreml();
            this.cfr_renamed_2.cfr_renamed_41();
            this.cfr_renamed_4 = (sprag)((Object)((sprdpf)arg0).cfr_renamed_5650());
            return;
        }
        throw new InvalidKeyException(sprdrda.cfr_renamed_9("f\u0007x\u0007|\u001e}Ic\u001cq\u0005z\n3\u0002v\u00103\u0019r\u001a`\fwIg\u000631^:@"));
    }
}

