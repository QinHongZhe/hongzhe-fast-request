/*
 * End-User License Agreement (EULA) of Restful Fast Request
 * This End-User License Agreement ("EULA") is a legal agreement between you and Kings(darkings1990@gmail.com). Our EULA was created by EULA Template for Restful Fast Request.
 *
 * This EULA agreement governs your acquisition and use of our Restful Fast Request software ("Software") directly from Kings(darkings1990@gmail.com) or indirectly through a Kings(darkings1990@gmail.com) authorized reseller or distributor (a "Reseller").
 *
 * Please read this EULA agreement carefully before completing the installation process and using the Restful Fast Request software. It provides a license to use the Restful Fast Request software and contains warranty information and liability disclaimers.
 *
 * If you register for a free trial of the Restful Fast Request software, this EULA agreement will also govern that trial. By clicking "accept" or installing and/or using the Restful Fast Request software, you are confirming your acceptance of the Software and agreeing to become bound by the terms of this EULA agreement.
 *
 * If you are entering into this EULA agreement on behalf of a company or other legal entity, you represent that you have the authority to bind such entity and its affiliates to these terms and conditions. If you do not have such authority or if you do not agree with the terms and conditions of this EULA agreement, do not install or use the Software, and you must not accept this EULA agreement.
 *
 * This EULA agreement shall apply only to the Software supplied by Kings(darkings1990@gmail.com) herewith regardless of whether other software is referred to or described herein. The terms also apply to any Kings(darkings1990@gmail.com) updates, supplements, Internet-based services, and support services for the Software, unless other terms accompany those items on delivery. If so, those terms apply.
 *
 * License Grant
 * Kings(darkings1990@gmail.com) hereby grants you a personal, non-transferable, non-exclusive licence to use the Restful Fast Request software on your devices in accordance with the terms of this EULA agreement.
 *
 * You are permitted to load the Restful Fast Request software (for example a PC, laptop, mobile or tablet) under your control. You are responsible for ensuring your device meets the minimum requirements of the Restful Fast Request software.
 *
 * You are not permitted to:
 *
 * Edit, alter, modify, adapt, translate or otherwise change the whole or any part of the Software nor permit the whole or any part of the Software to be combined with or become incorporated in any other software, nor decompile, disassemble or reverse engineer the Software or attempt to do any such things
 * Reproduce, copy, distribute, resell or otherwise use the Software for any commercial purpose
 * Allow any third party to use the Software on behalf of or for the benefit of any third party
 * Use the Software in any way which breaches any applicable local, national or international law
 * use the Software for any purpose that Kings(darkings1990@gmail.com) considers is a breach of this EULA agreement
 * Intellectual Property and Ownership
 * Kings(darkings1990@gmail.com) shall at all times retain ownership of the Software as originally downloaded by you and all subsequent downloads of the Software by you. The Software (and the copyright, and other intellectual property rights of whatever nature in the Software, including any modifications made thereto) are and shall remain the property of Kings(darkings1990@gmail.com).
 *
 * Kings(darkings1990@gmail.com) reserves the right to grant licences to use the Software to third parties.
 *
 * Termination
 * This EULA agreement is effective from the date you first use the Software and shall continue until terminated. You may terminate it at any time upon written notice to Kings(darkings1990@gmail.com).
 *
 * It will also terminate immediately if you fail to comply with any term of this EULA agreement. Upon such termination, the licenses granted by this EULA agreement will immediately terminate and you agree to stop all access and use of the Software. The provisions that by their nature continue and survive will survive any termination of this EULA agreement.
 *
 * Governing Law
 * This EULA agreement, and any dispute arising out of or in connection with this EULA agreement, shall be governed by and construed in accordance with the laws of cn.
 */

package io.github.kings1990.plugin.fastrequest.model;

import com.intellij.psi.PsiMethod;

import java.util.List;

public class ApiService {
    private String moduleName;
    private String packageName;
    private String className;
    private List<ApiMethod> apiMethodList;

    public ApiService() {
    }

    public ApiService(String moduleName, String packageName, String className, List<ApiMethod> apiMethodList) {
        this.moduleName = moduleName;
        this.packageName = packageName;
        this.className = className;
        this.apiMethodList = apiMethodList;
    }

    public static class ApiMethod {
        private PsiMethod psiMethod;
        private String url;
        private String description;
        private String name;
        private String methodType;

        public ApiMethod(PsiMethod psiMethod, String url, String description, String name, String methodType) {
            this.psiMethod = psiMethod;
            this.url = url;
            this.description = description;
            this.name = name;
            this.methodType = methodType;
        }

        public PsiMethod getPsiMethod() {
            return psiMethod;
        }

        @Override
        public String toString() {
            return url;
        }

        public void setPsiMethod(PsiMethod psiMethod) {
            this.psiMethod = psiMethod;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMethodType() {
            return methodType;
        }

        public void setMethodType(String methodType) {
            this.methodType = methodType;
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<ApiMethod> getApiMethodList() {
        return apiMethodList;
    }

    public void setApiMethodList(List<ApiMethod> apiMethodList) {
        this.apiMethodList = apiMethodList;
    }
}
