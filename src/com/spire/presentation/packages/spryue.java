/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprbjm;
import com.spire.presentation.packages.sprbve;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprijm;
import com.spire.presentation.packages.sprkem;
import com.spire.presentation.packages.sprnne;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class spryue
implements sprhd {
    private BigInteger cfr_renamed_119;
    private sprnne cfr_renamed_91;
    private Collection cfr_renamed_0;
    private Collection cfr_renamed_1;
    private sprbd cfr_renamed_2;
    private Date cfr_renamed_3;
    private sprbve cfr_renamed_4;

    public void cfr_renamed_5037(sprbd arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public Date cfr_renamed_195() {
        if (this.cfr_renamed_3 != null) {
            return new Date(this.cfr_renamed_3.getTime());
        }
        return null;
    }

    public void cfr_renamed_200(byte[] arg0) throws IOException {
        this.cfr_renamed_5038(sprigm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0)));
    }

    @Override
    public Object clone() {
        spryue spryue2 = new spryue();
        spryue spryue3 = this;
        spryue spryue4 = spryue2;
        spryue spryue5 = this;
        spryue2.cfr_renamed_2 = this.cfr_renamed_2;
        spryue2.cfr_renamed_3 = spryue5.cfr_renamed_195();
        spryue4.cfr_renamed_91 = spryue5.cfr_renamed_91;
        spryue4.cfr_renamed_4 = this.cfr_renamed_4;
        spryue2.cfr_renamed_119 = spryue3.cfr_renamed_119;
        spryue2.cfr_renamed_1 = spryue3.cfr_renamed_196();
        spryue2.cfr_renamed_0 = this.cfr_renamed_197();
        return spryue2;
    }

    public void cfr_renamed_198(Collection arg0) throws IOException {
        this.cfr_renamed_0 = this.cfr_renamed_199(arg0);
    }

    public Collection cfr_renamed_197() {
        return Collections.unmodifiableCollection(this.cfr_renamed_0);
    }

    public sprbve cfr_renamed_102() {
        return this.cfr_renamed_4;
    }

    public sprnne cfr_renamed_93() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_202(Collection arg0) throws IOException {
        this.cfr_renamed_1 = this.cfr_renamed_199(arg0);
    }

    public void cfr_renamed_5039(sprigm arg0) {
        this.cfr_renamed_1.add(arg0);
    }

    public void cfr_renamed_10(BigInteger arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public spryue() {
        spryue spryue2 = this;
        this.cfr_renamed_0 = new HashSet();
        spryue2.cfr_renamed_1 = new HashSet();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ Set cfr_renamed_199(Collection arg0) throws IOException {
        if (arg0 == null || arg0.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (Object e : arg0) {
            if (e instanceof sprigm) {
                hashSet.add(e);
                continue;
            }
            hashSet.add(sprigm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])e)));
        }
        return hashSet;
    }

    public void cfr_renamed_5040(sprnne arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_5038(sprigm arg0) {
        this.cfr_renamed_0.add(arg0);
    }

    public void cfr_renamed_5041(sprbve arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_192(Date arg0) {
        if (arg0 != null) {
            spryue spryue2 = this;
            spryue2.cfr_renamed_3 = new Date(arg0.getTime());
            return;
        }
        this.cfr_renamed_3 = null;
    }

    public Collection cfr_renamed_196() {
        return Collections.unmodifiableCollection(this.cfr_renamed_1);
    }

    public sprbd cfr_renamed_201() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_132(Object arg0) {
        byte[] byArray;
        spryue spryue2;
        if (!(arg0 instanceof sprbd)) {
            return false;
        }
        sprbd sprbd2 = (sprbd)arg0;
        if (this.cfr_renamed_2 != null && !this.cfr_renamed_2.equals(sprbd2)) {
            return false;
        }
        if (this.cfr_renamed_119 != null && !sprbd2.cfr_renamed_114().equals(this.cfr_renamed_119)) {
            return false;
        }
        if (this.cfr_renamed_91 != null && !sprbd2.cfr_renamed_93().equals(this.cfr_renamed_91)) {
            return false;
        }
        if (this.cfr_renamed_4 != null && !sprbd2.cfr_renamed_102().equals(this.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_3 != null) {
            try {
                sprbd2.cfr_renamed_96(this.cfr_renamed_3);
                spryue2 = this;
            }
            catch (CertificateExpiredException certificateExpiredException) {
                return false;
            }
            catch (CertificateNotYetValidException certificateNotYetValidException) {
                return false;
            }
        } else {
            spryue2 = this;
        }
        if (!(spryue2.cfr_renamed_0.isEmpty() && this.cfr_renamed_1.isEmpty() || (byArray = sprbd2.getExtensionValue(sprrdm.cfr_renamed_91.cfr_renamed_19())) == null)) {
            int n;
            sprijm[] sprijmArray;
            sprkem sprkem2;
            int n2;
            boolean bl;
            sprbjm sprbjm2;
            try {
                sprbjm2 = sprbjm.cfr_renamed_23(new sprrzm(((sprfvg)sprfvg.cfr_renamed_184(byArray)).cfr_renamed_186()).cfr_renamed_24());
            }
            catch (IOException iOException) {
                return false;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return false;
            }
            sprkem[] sprkemArray = sprbjm2.cfr_renamed_187();
            if (!this.cfr_renamed_0.isEmpty()) {
                bl = false;
                int n3 = n2 = 0;
                while (n3 < sprkemArray.length) {
                    sprkem2 = sprkemArray[n2];
                    sprijmArray = sprkem2.cfr_renamed_188();
                    int n4 = n = 0;
                    while (n4 < sprijmArray.length) {
                        if (this.cfr_renamed_0.contains(sprigm.cfr_renamed_23(sprijmArray[n].cfr_renamed_189()))) {
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
                while (n5 < sprkemArray.length) {
                    sprkem2 = sprkemArray[n2];
                    sprijmArray = sprkem2.cfr_renamed_188();
                    int n6 = n = 0;
                    while (n6 < sprijmArray.length) {
                        if (this.cfr_renamed_1.contains(sprigm.cfr_renamed_23(sprijmArray[n].cfr_renamed_190()))) {
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

    public void cfr_renamed_182(byte[] arg0) throws IOException {
        this.cfr_renamed_5039(sprigm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0)));
    }
}

