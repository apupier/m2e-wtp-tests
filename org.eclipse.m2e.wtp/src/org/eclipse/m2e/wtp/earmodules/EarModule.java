/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.eclipse.m2e.wtp.earmodules;

import org.apache.maven.artifact.Artifact;
import org.codehaus.plexus.util.xml.Xpp3Dom;


/**
 * This class was derived from maven-ear-plugin's org.apache.maven.plugin.ear.EarModule
 *  
 * The ear module interface.
 * 
 * @author <a href="snicoll@apache.org">Stephane Nicoll</a>
 */
public interface EarModule {

  /**
   * Returns the {@link Artifact} representing this module. <p/> Note that this might return <tt>null</tt> till the
   * module has been resolved.
   * 
   * @return the artifact
   * @see #resolveArtifact(java.util.Set)
   */
  public Artifact getArtifact();

  /**
   * Returns the <tt>URI</tt> for this module.
   * 
   * @return the <tt>URI</tt>
   */
  public String getUri();

  /**
   * Returns the type associated to the module.
   * 
   * @return the artifact's type of the module
   */
  public String getType();

  /**
   * Specify whether this module should be excluded or not.
   * 
   * @return true if this module should be skipped, false otherwise
   */
  public boolean isExcluded();

  /**
   * Specify whether this module should be unpacked in the EAR archive or not. <p/> Returns null if no configuration was
   * specified so that defaulting may apply.
   * 
   * @return true if this module should be bundled unpacked, false otherwise
   */
  public Boolean shouldUnpack();

  /**
   * The alt-dd element specifies an optional URI to the post-assembly version of the deployment descriptor file for a
   * particular Java EE module. The URI must specify the full pathname of the deployment descriptor file relative to the
   * application's root directory.
   * 
   * @return the alternative deployment descriptor for this module
   * @since JavaEE 5
   */
  public String getAltDeploymentDescriptor();

  public String getBundleDir();

  /**
   * @return the module fileName in the bundle directory 
   */
  public String getBundleFileName();

  /**
   * @return
   */
  public Xpp3Dom getAsDom();
}
