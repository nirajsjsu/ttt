/*
 * Copyright 2013 Skynav, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.skynav.ttv.app;

import java.io.PrintWriter;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import com.skynav.ttv.util.Configuration;
import com.skynav.ttv.util.ConfigurationDefaults;

public interface OptionProcessor {
    void resetAllState(boolean restart);
    URL getDefaultConfigurationLocator();
    ConfigurationDefaults getConfigurationDefaults(URL configLocator);
    Class<? extends Configuration> getConfigurationClass();
    List<String> preProcessOptions(List<String> args, Configuration configuration, Collection<OptionSpecification> shortOptions, Collection<OptionSpecification> longOptions);
    boolean hasOption(String arg);
    int parseOption(List<String> args, int index) throws UsageException;
    void processDerivedOptions();
    List<String> processNonOptionArguments(List<String> nonOptionArgs);
    List<String> processRestartArguments(List<String> args, List<String> nonOptionArgs, RestartOptions restartOptions);
    void showBanner(PrintWriter out);
    void showUsage(PrintWriter out);
    String getShowUsageCommand();
    void runOptions(PrintWriter out);
}
