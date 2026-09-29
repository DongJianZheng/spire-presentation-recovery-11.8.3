/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprenm;
import com.spire.presentation.packages.sprfhl;
import com.spire.presentation.packages.sprgei;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sproil;
import com.spire.presentation.packages.sprojl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.spruz;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprzvm;
import com.spire.presentation.packages.sprzw;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

public abstract class sprrhl
implements spruz {
    private static sprzw cfr_renamed_152;
    private PrivateKey cfr_renamed_112;
    private sprddm cfr_renamed_119;
    private sprni cfr_renamed_91;
    private static final Set cfr_renamed_0;
    private static sprzw cfr_renamed_1;
    private static sprzw cfr_renamed_2;
    public sprdul cfr_renamed_3;
    public sprdul cfr_renamed_4;

    public Key cfr_renamed_10720(sprlem arg0, SecretKey arg1, sprlem arg2, byte[] arg3) throws sprlyl, InvalidKeyException, NoSuchAlgorithmException {
        Cipher cipher;
        Cipher cipher2 = cipher = this.cfr_renamed_4.cfr_renamed_7430(arg0);
        cipher2.init(4, arg1);
        return cipher2.unwrap(arg3, this.cfr_renamed_4.cfr_renamed_10713(arg2), 3);
    }

    static {
        cfr_renamed_0 = new HashSet();
        cfr_renamed_0.add(sprbr.cfr_renamed_725);
        cfr_renamed_0.add(sprbr.cfr_renamed_96);
        cfr_renamed_2 = new sprojl();
        cfr_renamed_1 = new sproil();
        cfr_renamed_152 = new sprfhl();
    }

    @Override
    public sprddm cfr_renamed_3241() {
        if (this.cfr_renamed_119 == null) {
            this.cfr_renamed_119 = sprcom.cfr_renamed_23(this.cfr_renamed_112.getEncoded()).cfr_renamed_1254();
        }
        return this.cfr_renamed_119;
    }

    public sprrhl cfr_renamed_10721(sprddm arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprrhl(PrivateKey privateKey) {
        sprrhl sprrhl2 = this;
        this.cfr_renamed_4 = new sprdul(new sprjrl());
        this.cfr_renamed_3 = this.cfr_renamed_4;
        this.cfr_renamed_91 = new sprlgg();
        sprrhl2.cfr_renamed_119 = null;
        sprrhl2.cfr_renamed_112 = sproul.cfr_renamed_10695(privateKey);
    }

    /*
     * Exception decompiling
     */
    public Key cfr_renamed_10722(sprddm arg0, sprddm arg1, sprvhm arg2, sproug arg3, byte[] arg4) throws sprlyl {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public sprrhl cfr_renamed_1499(String arg0) {
        this.cfr_renamed_4 = new sprdul(new sprpfl(arg0));
        this.cfr_renamed_3 = this.cfr_renamed_4;
        return this;
    }

    private /* synthetic */ SecretKey cfr_renamed_10723(sprddm arg0, sprddm arg1, PublicKey arg2, sproug arg3, PrivateKey arg4, sprzw arg5) throws sprlyl, GeneralSecurityException, IOException {
        KeyAgreement keyAgreement;
        sprobi sprobi2;
        KeyAgreement keyAgreement2;
        block5: {
            block7: {
                block8: {
                    block6: {
                        block4: {
                            arg4 = sproul.cfr_renamed_10695(arg4);
                            if (sproul.cfr_renamed_10716(arg0.cfr_renamed_593())) {
                                byte[] byArray;
                                sprenm sprenm2 = sprenm.cfr_renamed_23(arg3.cfr_renamed_186());
                                sprvhm sprvhm2 = new sprvhm(this.cfr_renamed_3241(), sprenm2.cfr_renamed_2096().cfr_renamed_1157().cfr_renamed_81());
                                X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprvhm2.cfr_renamed_91());
                                sprrhl sprrhl2 = this;
                                PublicKey publicKey = sprrhl2.cfr_renamed_4.cfr_renamed_10710(arg0.cfr_renamed_593()).generatePublic(x509EncodedKeySpec);
                                KeyAgreement keyAgreement3 = sprrhl2.cfr_renamed_4.cfr_renamed_7439(arg0.cfr_renamed_593());
                                byte[] byArray2 = byArray = sprenm2.cfr_renamed_4838() != null ? sprenm2.cfr_renamed_4838().cfr_renamed_186() : null;
                                if (arg5 == cfr_renamed_2) {
                                    sprddm sprddm2 = arg1;
                                    byArray = cfr_renamed_2.cfr_renamed_10692(sprddm2, this.cfr_renamed_91.cfr_renamed_7385(sprddm2), byArray);
                                }
                                KeyAgreement keyAgreement4 = keyAgreement3;
                                PrivateKey privateKey = arg4;
                                PrivateKey privateKey2 = arg4;
                                keyAgreement4.init((Key)privateKey2, new sprgei(privateKey2, publicKey, byArray));
                                keyAgreement4.doPhase(arg2, true);
                                return keyAgreement3.generateSecret(arg1.cfr_renamed_593().cfr_renamed_19());
                            }
                            keyAgreement2 = this.cfr_renamed_4.cfr_renamed_7439(arg0.cfr_renamed_593());
                            sprobi2 = null;
                            if (!sproul.cfr_renamed_10717(arg0.cfr_renamed_593())) break block4;
                            sprzw sprzw2 = arg5;
                            if (arg3 != null) {
                                sprddm sprddm3 = arg1;
                                byte[] byArray = sprzw2.cfr_renamed_10692(sprddm3, this.cfr_renamed_91.cfr_renamed_7385(sprddm3), arg3.cfr_renamed_186());
                                sprobi2 = new sprobi(byArray);
                                keyAgreement = keyAgreement2;
                            } else {
                                byte[] byArray = sprzw2.cfr_renamed_10692(arg1, this.cfr_renamed_91.cfr_renamed_7385(arg1), null);
                                sprobi2 = new sprobi(byArray);
                                keyAgreement = keyAgreement2;
                            }
                            break block5;
                        }
                        if (!sproul.cfr_renamed_10718(arg0.cfr_renamed_593())) break block6;
                        if (arg3 == null) break block7;
                        sprobi2 = new sprobi(arg3.cfr_renamed_186());
                        keyAgreement = keyAgreement2;
                        break block5;
                    }
                    if (!sproul.cfr_renamed_7452(arg0.cfr_renamed_593())) break block8;
                    if (arg3 == null) break block7;
                    sprobi2 = new sprobi(arg3.cfr_renamed_186());
                    keyAgreement = keyAgreement2;
                    break block5;
                }
                throw new sprlyl(new StringBuilder().insert(0, sprzvm.cfr_renamed_9("VNhNlWm\u0000hEz\u0000bGqEfMfNw\u0000bLdOqIwHn\u001a#")).append(arg0.cfr_renamed_593()).toString());
            }
            keyAgreement = keyAgreement2;
        }
        keyAgreement.init((Key)arg4, sprobi2);
        KeyAgreement keyAgreement5 = keyAgreement2;
        keyAgreement5.doPhase(arg2, true);
        return keyAgreement5.generateSecret(arg1.cfr_renamed_593().cfr_renamed_19());
    }

    public sprrhl cfr_renamed_4051(Provider arg0) {
        this.cfr_renamed_3 = sproul.cfr_renamed_4052(arg0);
        return this;
    }

    public sprrhl cfr_renamed_4045(String arg0) {
        this.cfr_renamed_3 = sproul.cfr_renamed_4046(arg0);
        return this;
    }

    public sprrhl cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_4 = new sprdul(new sprdhl(arg0));
        this.cfr_renamed_3 = this.cfr_renamed_4;
        return this;
    }
}

