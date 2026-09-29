/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraua;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmae;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpbe;
import com.spire.presentation.packages.sprrva;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryfe;
import com.spire.presentation.packages.sprz;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class sprkna
implements sprb {
    private sprz cfr_renamed_119;
    private Date cfr_renamed_91;
    private Collection cfr_renamed_0;
    private Collection cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private sprrva cfr_renamed_3;
    private spraua cfr_renamed_4;

    public void cfr_renamed_10(BigInteger arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_182(byte[] arg0) throws IOException {
        this.cfr_renamed_183(sprmee.cfr_renamed_23(sprvva.cfr_renamed_184(arg0)));
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        byte[] byArray;
        sprkna sprkna2;
        if (!(arg0 instanceof sprz)) {
            return false;
        }
        sprz sprz2 = (sprz)arg0;
        if (this.cfr_renamed_119 != null && !this.cfr_renamed_119.equals(sprz2)) {
            return false;
        }
        if (this.cfr_renamed_2 != null && !sprz2.cfr_renamed_114().equals(this.cfr_renamed_2)) {
            return false;
        }
        if (this.cfr_renamed_3 != null && !sprz2.cfr_renamed_93().equals(this.cfr_renamed_3)) {
            return false;
        }
        if (this.cfr_renamed_4 != null && !sprz2.cfr_renamed_102().equals(this.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_91 != null) {
            try {
                sprz2.cfr_renamed_96(this.cfr_renamed_91);
                sprkna2 = this;
            }
            catch (CertificateExpiredException certificateExpiredException) {
                return false;
            }
            catch (CertificateNotYetValidException certificateNotYetValidException) {
                return false;
            }
        } else {
            sprkna2 = this;
        }
        if (!(sprkna2.cfr_renamed_0.isEmpty() && this.cfr_renamed_1.isEmpty() || (byArray = sprz2.getExtensionValue(sprude.cfr_renamed_185.cfr_renamed_19())) == null)) {
            int n;
            sprpbe[] sprpbeArray;
            spryfe spryfe2;
            int n2;
            boolean bl;
            sprmae sprmae2;
            try {
                sprmae2 = sprmae.cfr_renamed_23(new sprgle(((sprlqe)sprlqe.cfr_renamed_184(byArray)).cfr_renamed_186()).cfr_renamed_24());
            }
            catch (IOException iOException) {
                return false;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return false;
            }
            spryfe[] spryfeArray = sprmae2.cfr_renamed_187();
            if (!this.cfr_renamed_0.isEmpty()) {
                bl = false;
                int n3 = n2 = 0;
                while (n3 < spryfeArray.length) {
                    spryfe2 = spryfeArray[n2];
                    sprpbeArray = spryfe2.cfr_renamed_188();
                    int n4 = n = 0;
                    while (n4 < sprpbeArray.length) {
                        if (this.cfr_renamed_0.contains(sprmee.cfr_renamed_23(sprpbeArray[n].cfr_renamed_189()))) {
                            bl = true;
                            break;
                        }
                        n4 = ++n;
                    }
                    n3 = ++n2;
                }
                if (!bl) {
                    return false;
                }
            }
            if (!this.cfr_renamed_1.isEmpty()) {
                bl = false;
                int n5 = n2 = 0;
                while (n5 < spryfeArray.length) {
                    spryfe2 = spryfeArray[n2];
                    sprpbeArray = spryfe2.cfr_renamed_188();
                    int n6 = n = 0;
                    while (n6 < sprpbeArray.length) {
                        if (this.cfr_renamed_1.contains(sprmee.cfr_renamed_23(sprpbeArray[n].cfr_renamed_190()))) {
                            bl = true;
                            break;
                        }
                        n6 = ++n;
                    }
                    n5 = ++n2;
                }
                if (!bl) {
                    return false;
                }
            }
        }
        return true;
    }

    public spraua cfr_renamed_102() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_191(spraua arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprrva cfr_renamed_93() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_192(Date arg0) {
        if (arg0 != null) {
            sprkna sprkna2 = this;
            sprkna2.cfr_renamed_91 = new Date(arg0.getTime());
            return;
        }
        this.cfr_renamed_91 = null;
    }

    public void cfr_renamed_193(sprrva arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprkna() {
        sprkna sprkna2 = this;
        this.cfr_renamed_0 = new HashSet();
        sprkna2.cfr_renamed_1 = new HashSet();
    }

    public void cfr_renamed_194(sprmee arg0) {
        this.cfr_renamed_0.add(arg0);
    }

    @Override
    public Object clone() {
        sprkna sprkna2 = new sprkna();
        sprkna sprkna3 = this;
        sprkna sprkna4 = sprkna2;
        sprkna sprkna5 = this;
        sprkna2.cfr_renamed_119 = this.cfr_renamed_119;
        sprkna2.cfr_renamed_91 = sprkna5.cfr_renamed_195();
        sprkna4.cfr_renamed_3 = sprkna5.cfr_renamed_3;
        sprkna4.cfr_renamed_4 = this.cfr_renamed_4;
        sprkna2.cfr_renamed_2 = sprkna3.cfr_renamed_2;
        sprkna2.cfr_renamed_1 = sprkna3.cfr_renamed_196();
        sprkna2.cfr_renamed_0 = this.cfr_renamed_197();
        return sprkna2;
    }

    public void cfr_renamed_198(Collection arg0) throws IOException {
        this.cfr_renamed_0 = this.cfr_renamed_199(arg0);
    }

    public void cfr_renamed_183(sprmee arg0) {
        this.cfr_renamed_1.add(arg0);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    public Collection cfr_renamed_196() {
        return Collections.unmodifiableCollection(this.cfr_renamed_1);
    }

    public void cfr_renamed_200(byte[] arg0) throws IOException {
        this.cfr_renamed_194(sprmee.cfr_renamed_23(sprvva.cfr_renamed_184(arg0)));
    }

    public sprz cfr_renamed_201() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_202(Collection arg0) throws IOException {
        this.cfr_renamed_1 = this.cfr_renamed_199(arg0);
    }

    public Date cfr_renamed_195() {
        if (this.cfr_renamed_91 != null) {
            return new Date(this.cfr_renamed_91.getTime());
        }
        return null;
    }

    public Collection cfr_renamed_197() {
        return Collections.unmodifiableCollection(this.cfr_renamed_0);
    }

    private /* synthetic */ Set cfr_renamed_199(Collection arg0) throws IOException {
        if (arg0 == null || arg0.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (Object e : arg0) {
            if (e instanceof sprmee) {
                hashSet.add(e);
                continue;
            }
            hashSet.add(sprmee.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])e)));
        }
        return hashSet;
    }

    public void cfr_renamed_203(sprz arg0) {
        this.cfr_renamed_119 = arg0;
    }
}

