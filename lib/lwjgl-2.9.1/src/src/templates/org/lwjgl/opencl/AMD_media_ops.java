/*
 * Copyright (c) 2002-2010 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opencl;

import org.lwjgl.util.generator.opencl.CLDeviceExtension;

@CLDeviceExtension
public interface AMD_media_ops {

}                                                                                                                                                                                                                                                                                                            corator.decorateResource(GitLightweightDecorator.java:201)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorate(GitLightweightDecorator.java:176)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorDefinition.decorate(LightweightDecoratorDefinition.java:267)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$LightweightRunnable.run(LightweightDecoratorManager.java:83)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.decorate(LightweightDecoratorManager.java:367)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.getDecorations(LightweightDecoratorManager.java:349)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.ensureResultCached(DecorationScheduler.java:372)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.run(DecorationScheduler.java:332)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)
Caused by: org.eclipse.jgit.errors.MissingObjectException: Missing commit 15d572b1a57dec052dc08ae9165b473d0dda7c44
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.revwalk.RevWalk.getCachedBytes(RevWalk.java:883)
	at org.eclipse.jgit.revwalk.RevCommit.parseHeaders(RevCommit.java:145)
	at org.eclipse.jgit.revwalk.MergeBaseGenerator.next(MergeBaseGenerator.java:148)
	at org.eclipse.jgit.revwalk.StartGenerator.next(StartGenerator.java:102)
	at org.eclipse.jgit.revwalk.RevWalk.next(RevWalk.java:421)
	at org.eclipse.jgit.lib.BranchTrackingStatus.of(BranchTrackingStatus.java:98)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceHelper.getBranchStatus(DecoratableResourceHelper.java:48)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceAdapter.<init>(DecoratableResourceAdapter.java:74)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:199)
	... 9 more
!SUBENTRY 1 org.eclipse.egit.ui 4 0 2015-01-09 15:38:36.909
!MESSAGE Errors occurred while applying Git decorations to resources.
!STACK 0
org.eclipse.jgit.errors.MissingObjectException: Missing commit 15d572b1a57dec052dc08ae9165b473d0dda7c44
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.revwalk.RevWalk.getCachedBytes(RevWalk.java:883)
	at org.eclipse.jgit.revwalk.RevCommit.parseHeaders(RevCommit.java:145)
	at org.eclipse.jgit.revwalk.MergeBaseGenerator.next(MergeBaseGenerator.java:148)
	at org.eclipse.jgit.revwalk.StartGenerator.next(StartGenerator.java:102)
	at org.eclipse.jgit.revwalk.RevWalk.next(RevWalk.java:421)
	at org.eclipse.jgit.lib.BranchTrackingStatus.of(BranchTrackingStatus.java:98)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceHelper.getBranchStatus(DecoratableResourceHelper.java:48)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceAdapter.<init>(DecoratableResourceAdapter.java:74)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:199)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorate(GitLightweightDecorator.java:176)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorDefinition.decorate(LightweightDecoratorDefinition.java:267)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$LightweightRunnable.run(LightweightDecoratorManager.java:83)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.decorate(LightweightDecoratorManager.java:367)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.getDecorations(LightweightDecoratorManager.java:349)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.ensureResultCached(DecorationScheduler.java:372)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.run(DecorationScheduler.java:332)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)

!ENTRY org.eclipse.egit.ui 4 0 2015-01-09 15:38:37.063
!MESSAGE Errors occurred while applying Git decorations to resources.
!STACK 1
org.eclipse.core.runtime.CoreException: Errors occurred while applying Git decorations to resources.
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:201)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorate(GitLightweightDecorator.java:176)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorDefinition.decorate(LightweightDecoratorDefinition.java:267)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$LightweightRunnable.run(LightweightDecoratorManager.java:83)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.decorate(LightweightDecoratorManager.java:367)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.getDecorations(LightweightDecoratorManager.java:349)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.ensureResultCached(DecorationScheduler.java:372)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.run(DecorationScheduler.java:332)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)
Caused by: org.eclipse.jgit.errors.MissingObjectException: Missing commit 15d572b1a57dec052dc08ae9165b473d0dda7c44
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.revwalk.RevWalk.getCachedBytes(RevWalk.java:883)
	at org.eclipse.jgit.revwalk.RevCommit.parseHeaders(RevCommit.java:145)
	at org.eclipse.jgit.revwalk.MergeBaseGenerator.next(MergeBaseGenerator.java:148)
	at org.eclipse.jgit.revwalk.StartGenerator.next(StartGenerator.java:102)
	at org.eclipse.jgit.revwalk.RevWalk.next(RevWalk.java:421)
	at org.eclipse.jgit.lib.BranchTrackingStatus.of(BranchTrackingStatus.java:98)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceHelper.getBranchStatus(DecoratableResourceHelper.java:48)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceAdapter.<init>(DecoratableResourceAdapter.java:74)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:199)
	... 9 more
!SUBENTRY 1 org.eclipse.egit.ui 4 0 2015-01-09 15:38:37.063
!MESSAGE Errors occurred while applying Git decorations to resources.
!STACK 0
org.eclipse.jgit.errors.MissingObjectException: Missing commit 15d572b1a57dec052dc08ae9165b473d0dda7c44
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.revwalk.RevWalk.getCachedBytes(RevWalk.java:883)
	at org.eclipse.jgit.revwalk.RevCommit.parseHeaders(RevCommit.java:145)
	at org.eclipse.jgit.revwalk.MergeBaseGenerator.next(MergeBaseGenerator.java:148)
	at org.eclipse.jgit.revwalk.StartGenerator.next(StartGenerator.java:102)
	at org.eclipse.jgit.revwalk.RevWalk.next(RevWalk.java:421)
	at org.eclipse.jgit.lib.BranchTrackingStatus.of(BranchTrackingStatus.java:98)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceHelper.getBranchStatus(DecoratableResourceHelper.java:48)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceAdapter.<init>(DecoratableResourceAdapter.java:74)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:199)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorate(GitLightweightDecorator.java:176)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorDefinition.decorate(LightweightDecoratorDefinition.java:267)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$LightweightRunnable.run(LightweightDecoratorManager.java:83)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.decorate(LightweightDecoratorManager.java:367)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.getDecorations(LightweightDecoratorManager.java:349)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.ensureResultCached(DecorationScheduler.java:372)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.run(DecorationScheduler.java:332)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)

!ENTRY org.eclipse.egit.ui 4 0 2015-01-09 15:39:01.698
!MESSAGE Error occurred computing diffs
!STACK 0
org.eclipse.jgit.errors.MissingObjectException: Missing tree 439d63f3c7de411302a26d2cec7be7709a7883ac
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.treewalk.CanonicalTreeParser.reset(CanonicalTreeParser.java:202)
	at org.eclipse.jgit.treewalk.CanonicalTreeParser.createSubtreeIterator0(CanonicalTreeParser.java:236)
	at org.eclipse.jgit.treewalk.CanonicalTreeParser.createSubtreeIterator(CanonicalTreeParser.java:214)
	at org.eclipse.jgit.treewalk.CanonicalTreeParser.createSubtreeIterator(CanonicalTreeParser.java:60)
	at org.eclipse.jgit.treewalk.TreeWalk.enterSubtree(TreeWalk.java:912)
	at org.eclipse.jgit.treewalk.TreeWalk.next(TreeWalk.java:566)
	at org.eclipse.jgit.lib.IndexDiff.diff(IndexDiff.java:389)
	at org.eclipse.egit.ui.internal.commit.CommitUI.buildIndexHeadDiffList(CommitUI.java:283)
	at org.eclipse.egit.ui.internal.commit.CommitUI.access$0(CommitUI.java:264)
	at org.eclipse.egit.ui.internal.commit.CommitUI$1.run(CommitUI.java:128)
	at org.eclipse.jface.operation.ModalContext$ModalContextThread.run(ModalContext.java:122)

!ENTRY org.eclipse.egit.ui 4 0 2015-01-09 15:42:23.853
!MESSAGE Errors occurred while applying Git decorations to resources.
!STACK 1
org.eclipse.core.runtime.CoreException: Errors occurred while applying Git decorations to resources.
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:201)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorate(GitLightweightDecorator.java:176)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorDefinition.decorate(LightweightDecoratorDefinition.java:267)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$LightweightRunnable.run(LightweightDecoratorManager.java:83)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.decorate(LightweightDecoratorManager.java:367)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.getDecorations(LightweightDecoratorManager.java:349)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.ensureResultCached(DecorationScheduler.java:372)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.run(DecorationScheduler.java:332)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)
Caused by: org.eclipse.jgit.errors.MissingObjectException: Missing commit 15d572b1a57dec052dc08ae9165b473d0dda7c44
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.revwalk.RevWalk.getCachedBytes(RevWalk.java:883)
	at org.eclipse.jgit.revwalk.RevCommit.parseHeaders(RevCommit.java:145)
	at org.eclipse.jgit.revwalk.MergeBaseGenerator.next(MergeBaseGenerator.java:148)
	at org.eclipse.jgit.revwalk.StartGenerator.next(StartGenerator.java:102)
	at org.eclipse.jgit.revwalk.RevWalk.next(RevWalk.java:421)
	at org.eclipse.jgit.lib.BranchTrackingStatus.of(BranchTrackingStatus.java:98)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceHelper.getBranchStatus(DecoratableResourceHelper.java:48)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceAdapter.<init>(DecoratableResourceAdapter.java:74)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:199)
	... 9 more
!SUBENTRY 1 org.eclipse.egit.ui 4 0 2015-01-09 15:42:23.853
!MESSAGE Errors occurred while applying Git decorations to resources.
!STACK 0
org.eclipse.jgit.errors.MissingObjectException: Missing commit 15d572b1a57dec052dc08ae9165b473d0dda7c44
	at org.eclipse.jgit.internal.storage.file.WindowCursor.open(WindowCursor.java:149)
	at org.eclipse.jgit.revwalk.RevWalk.getCachedBytes(RevWalk.java:883)
	at org.eclipse.jgit.revwalk.RevCommit.parseHeaders(RevCommit.java:145)
	at org.eclipse.jgit.revwalk.MergeBaseGenerator.next(MergeBaseGenerator.java:148)
	at org.eclipse.jgit.revwalk.StartGenerator.next(StartGenerator.java:102)
	at org.eclipse.jgit.revwalk.RevWalk.next(RevWalk.java:421)
	at org.eclipse.jgit.lib.BranchTrackingStatus.of(BranchTrackingStatus.java:98)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceHelper.getBranchStatus(DecoratableResourceHelper.java:48)
	at org.eclipse.egit.ui.internal.decorators.DecoratableResourceAdapter.<init>(DecoratableResourceAdapter.java:74)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorateResource(GitLightweightDecorator.java:199)
	at org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator.decorate(GitLightweightDecorator.java:176)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorDefinition.decorate(LightweightDecoratorDefinition.java:267)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$LightweightRunnable.run(LightweightDecoratorManager.java:83)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.decorate(LightweightDecoratorManager.java:367)
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager.getDecorations(LightweightDecoratorManager.java:349)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.ensureResultCached(DecorationScheduler.java:372)
	at org.eclipse.ui.internal.decorators.DecorationScheduler$1.run(DecorationScheduler.java:332)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)

!ENTRY org.eclipse.egit.ui 4 0 2015-01-09 15:42:27.391
!MESSAGE Errors occurred while applying Git decorations to resources.
!STACK 1
org.eclipse.core.runtime.CoreException: Errors occurred while applying Git decorations to resources.
	at org.eclipse.egit.ui.internal.decorators.GitLig\_PLL��|3��U�;7=�̴��n�6���3���>���E��[LL9�i�f�u�z`���<������ް\�����=�ܣ~硧�'X	[2��4&��p�I�>���5	/���_����u���"������r��U˵s�N����^{�y������hs-���������w��<QL�	���R�u�������@S[[��X\�[..۶mS��w�~��u�ۑ�{��|��h�>��Oy��~�=�#�<�A�s�R]]�T�j˖-�ы�����B��C=��%4s���/�Ç���{�K���3�<���a7��u~�s;�zk�E���G8�y��O�/�r��o�[=}���]=���ޟ�%^��f3�aJy�����K����-�zo0_�կ~�m/�/׻p:��\�𦍂���/�r}G,�E<���o�7�ia��K����S�ES�R�W�����11+`>�����;ĺ���UḾ��    IEND�B`�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              rWorlds/0���� concludeInit/0���� setSplash/1���� alSourcei/0���� value/0      ; < o � � setMaxHunger/1���� toDegrees/1���v alDeleteSources/0���� noise/2���q checkChunk/1���h 
postInit/0    $ I killInstance/0���� updateChart/0���� get/1     	 
        1 U \ ^ _ d h i m n o p w � � � � glGetShaderInfoLog/0���� 	GL_FLAT/0���� getGLContext/0     $ 8 m p q r s t � � setPosition/1     5 L T glBindTexture/2���� sync/1���� GL_MODELVIEW/0    3 o v getRGB/7���� getNormalIndices/0���� 
register/0    $ ( ? e g readFloat/0���� getMetadata/3    � � � � setLayout/1    	 
    addFragmentShader/1���� convertToByteBuffer/1���� glEnableVertexAttribArray/1���� glDisableVertexAttribArray/1���� glDeleteProgram/0���� totalMemory/0���� load/1���� initDisplay/2���� setLightSorce/1���� accessByName/1       > q r 
writeInt/1    J K M P Q S getCapabilities/0���� 	getName/0      	    % ( * . 0 > ? F e m � � 
fillRect/4���� decode/1���� 
conclude/0���� setLightColor/4���u 	setBold/2���� 	readInt/0    J K M N P Q R S 
getFaces/0    Y ^ _ m n setStackTrace/1    L T 	getTags/0     � glLoadMatrix/1���� GL_SRC_ALPHA/0���� setBorder/1       addRenderable/1���� getProperty/1    u x trim/0    x � getDiffuseColour/0���� rotate/1    W Y Z _ 
setModel/1���� longValue/0���| init/1���� setCubeWithMetadata/3���h 	isSolid/1    c � � � 
getValue/0     : � pause/0     . removeElementAt/1���� glFrontFace/1���� dot/4���p updataChunks/0���h generateTexturMap/2    � � getKeyCount/0    < B glGenerateMipmap/0���� setInvSize/2    L T byteValue/0���| glGetShaderInfoLog/2���� getColors/3    p � equals/2    @ B getTextureHeight/0���� getSystemTime/0���� alSourcePause/1���� 
getBytes/0���{ glGetString/1���� glUniform1f/2���� updateAll/0���� setPreferredSize/1���� forceVBOUpdate/0    q � � isVisable/1    p � � exists/0     x getElementAt/1���� 
GL_BLEND/0���� getMaterials/0    m n deleteBuffer/1    r t getPosition/0      5 o � registerThread/1���� registerThreads/0���� setDisplayName/1           getAccess/0    $ c � � � fastfloor/1���p GL_RESCALE_NORMAL/0    o v removeAllElements/0���� setMaxMana/1���� checkChunksVBO/0���o setDefaultLocation/1���� getSpecularColour/0���� isVboUpdateNeeded/0    1 � getInvSlot/0    L T 
register/1���~ getFamily/0���� bind/0    f s t v cleanUp_Render3D/0���� getServer/0���� close/0    	 
  > d n x � registerChunk/1���t hasNormals/0���� intersectsPlane/2    Y ^ 	getItem/0���� asin/1���� 
getWorld/0���� set/2     m glTexCoord2f/2    s v getDefaultRender/0���� GL_VERTEX_SHADER/0���� 
conclude/1���� getArrayType/1���z writeReport/1���� 	getSize/0    
    M � 	getTime/0    
 x � getParentFile/0���� startsWith/1       n enableRenderUtilitys/0���� 
getColor/0���� 	getAABB/0    X \ _ invokeLater/1���� glViewport/0���� clearElements/0���� next/0���s 	getName/1     getVertices/4      p � setCanMove/1���� getViewport/0���� getGLSLVersion/0���� setToDefaultProperties/0���� getDefaultToolkit/0    	 
 getFrames/0���� 	setName/1    J U 	destroy/0���� alSourcePlay/0���� setX/1    : � registerOBJ/1    ( ? e g glUniform1i/0���� glTexParameteri/3���� 
getSound/0���� gluPerspective/4���� sqrt/1     Y � � setupMipMaping/0���� setLightValue/4���u genVBOids/0    1 � setRotation/1���� 
getPitch/0���� addThread/1    # $ 0 	replace/2���� glDeleteShader/0���� 	GL_RGBA/0���� glTexImage2D/0���� getPlayerID/0    L T setSubSelection/1���� dot/5���p doesSetContainCube/1���u defaultActivate/0���� addActionListener/1    	 
    addListSelectionListener/1       doesChunkContainCube/1���u 
setTitle/1     $ v resetVectors/0���� alGenSources/0���� getLocalPort/0    J U setTextureMap/1���u glVertexAttribPointer/6    8 m q r glGenBuffers/1���� writeItemStack/2���� 	stopAll/0    # $ AL_ORIENTATION/0���� getParent/0���� setRenderDistance/1���� setUpPerspectives/0    5 o getDescription/0���� getOpenGLVersion/0���� setupOpenGL/1���� isCreated/0���� resume/0     . updatePartVBO/1���� alGetSourcei/0���� setContentPane/1���� freeMemory/0���� 
truncate/0���m 	readAll/1      5 � addShader/1���� shortValue/0���| glIsEnabled/0���� GL_ONE_MINUS_SRC_ALPHA/0���� setUpdatePolicy/1���� glLoadIdentity/0    3 o v registerCommand/1���� addTag/1���� getTickRate/0���� checkCollisions/1���� glCompileShader/1���� 
setSolid/1      glAttachShader/0���� intersectAABB/2���� setHunger/1     5 
setUsers/1���� alSourcePause/0���� checkChunk/3    � � writeFloat/1���� 
getWorld/1���u findUnloadedChunks/0���t GL_SMOOTH/0    l o update/0    $ , . 5 7 9 = v getTextureCoordinates/0    l m n getTextureSize/0       GL_CULL_FACE/0    o v glShaderSource/0���� getWindow/0���� genBufferIds/1    8 m p q � remove/1   	   , = m o � � � getConsole/0    $ 5 round/1    . � � � � glColorMaterial/0���� setInvSlot/3    L T 	println/0���� getStepValue/0���� getRotation/0    4 5 _ o getY/0          8 : ; < A B R c d m o p s t � � � � � � � � getTextures/0     g getSelectedIndex/0    	    	setSize/1      
subtract/1     V W Y Z [ \ ^ _ c � � � � � 	AL_GAIN/0���� direction/0    c � lessThenOrEqual/1    V W [ _ � isSelected/0    
   8 : < getKeyCode/0���� alSourcei/3���� getArrayType/0���� alDeleteBuffers/0     glAttachShader/2���� record/5���� 
addStyle/2���� setMaterial/1      GL_TEXTURE_WRAP_T/0���� 	getGain/0���� addCubeRegistery/1���� 
intValue/0    h � GL_STATIC_DRAW/0    8 q checkVBOs/0���� checkScrollBar/1���� tick/0    $ - addThreadRegistery/1���� getUserID/0���� listFiles/0    	 $ getPlayer/0        $ 7 8 9 : < o glShaderSource/2���� addRegistry/1    ( ? e g o glPushAttrib/1���� glTranslatef/0    3 m o s t printStackTrace/1���n getObject/1���h getFPS/0���� GL_COLOR_BUFFER_BIT/0    o v addAdjustmentListener/1���� GL_DEPTH_BUFFER_BIT/0    o v tagTypeToIndex/1���� 	isAlive/0���� parseDouble/1     � setHunger/2    L T GL_FRAGMENT_SHADER/0���� 	getGuis/0    ( > ? setLeftComponent/1���� setCollisionBox/1���� glGenerateMipmap/1���� 	getIcon/0���� glCullFace/1���� glUniform3f/4���� isFullscreen/0���� getCamera/0���� invalidCommand/0���� currentTimeMillis/0���h start/0    $ - 0 J U createHorizontalGlue/0���� 
getClass/0    E G � � isLive/0����   � <GameEngine/1/ /com.GameName.Engine/GameName_New/gameName/ ���� JTeleportPlayerCommand/1/ /com.GameName.Command.Commands/GameEngine/eng/ ���� AnimationStep/2/ ���� /#/ က/com.GameName.Networking���� AnimationStep/3/ ���� �GUISlideBar/10/ /com.GameName.GUI.Components/GameEngine,int,float,float,float,float,float,int,int,boolean/eng,id,x,y,width,height,run,max,min,vertical/ ���� 9Vector3f/1/ /com.GameName.Util.Vectors/Vector2f/clone/ ���v 3CommandRegistry/#/ /com.GameName.Engine.Registries���� @HelpCommand/1/ /com.GameName.Command.Commands/GameEngine/eng/ ���� 0CubeRegistry/#/ /com.GameName.Engine.Registries���� 1WorldRegistry/#/ /com.GameName.Engine.Registries���� sRenderImage/6/ /com.GameName.Render.Types/GameEngine,float,float,float,float,Texture/eng,x,y,width,height,image/ ���� /GuiRegistry/#/ /com.GameName.Engine.Registries���� !GuiRegistry/#/ /com.GameName.GUI����  GUIManager/#/ /com.GameName.GUI���� 2Item/2/Ё /com.GameName.Items/String,int/name,id/ ���� /ThreadGroup/0/ /com.GameName.Engine.Threads/ ���� OSphereShape/2/ /com.GameName.Physics.Collision/Vector3f,float/center,radius/ ���� RLoadedWorld/3/ /com.GameName.World/GameEngine,World,String/eng,world,worldName/ ���o <Sound/2/ /com.GameName.Audio/String,String/location,type/      0Sound/1/ /com.GameName.Audio/String/location/      ZPhysicsObject/2/Ё /com.GameName.Physics/CollisionShape,Material/collisionShape,material/ ���� iSmartScroller/3/ /com.GameName.Console.Base/JScrollPane,int,JCheckBox/scrollPane,viewportPosition,box/ ���� }SmartScroller/4/ /com.GameName.Console.Base/JScrollPane,int,int,JCheckBox/scrollPane,scrollDirection,viewportPosition,box/ ���� >World/4/ /com.GameName.World/int,int,int,String/x,y,z,name/ ���h &ServerWorld/0/ /com.GameName.World/ ���i /ConsoleWindow/0/ /com.GameName.Console.Base/ ���� ZPacketPlayerInventorySize/2/ /com.GameName.Networking.Packets/int,int/invSize,playerID/ ���� CConvexPolygonCollisionDispatcher/#/ /com.GameName.Physics.Dispatch���� 6CollisionDispatcher/#/Ё /com.GameName.Physics.Dispatch���� iPacketPlayerInventorySlot/3/ /com.GameName.Networking.Packets/int,int,ItemStack/playerID,invSlot,slot/ ���� APacketPlayerInventorySize/0/ /com.GameName.Networking.Packets/ ���� .Packet/0/Ё /com.GameName.Networking.Packets/ ���� APacketPlayerInventorySlot/0/ /com.GameName.Networking.Packets/ ���� =PacketConnectResponse/0/ /com.GameName.Networking.Packets/ ���� <PacketPlayerLocation/0/ /com.GameName.Networking.Packets/ ���� 9PacketPlayerStats/0/ /com.GameName.Networking.Packets/ ���� VChunk/6/ /com.GameName.World/GameEngine,int,int,int,int,int/eng,size,worldId,x,y,z/ ���u 5PacketMessage/0/ /com.GameName.Networking.Packets/ ���� PChunkLoader/3/ /com.GameName.World/GameEngine,World,int/eng,world,loadRadius/ ���t =EntityThread/1/ /com.GameName.Engine.Threads/int/tickRate/ ���� aTexture/4/ /com.GameName.Render.Effects/int,String,int,int/textureId,textureName,width,height/ ���� TCamera/4/ /com.GameName.Entity/float,float,float,float/fov,aspect,near,farRender/ ���� 2CollisionShape/#/Ё /com.GameName.Physics.Collision���� dRayTrace/4/ /com.GameName.World/Vector3f[],World,Vector3f,Vector3f/results,world,startPos,endPos/ ���l }GUIButton/7/ /com.GameName.GUI.Components/GameEngine,int,float,float,float,float,boolean/eng,id,x,y,width,height,onlyOnce/ ���� $ItemStack/0/ /com.GameName.Items/ ���� *IconLoader/#/ /com.GameName.Render.Window���� Side/#/䀁 /com.GameName.Util���} Triangle/3/ ���� BConsoleTab/2/Ё /com.GameName.Console.Base/String,Icon/name,icon/ ���� )Window/0/ /com.GameName.Render.Window/ ���� 1IEntityRegister/#/ȁ /com.GameName.Util.Interfaces���� 2ICommandRegister/#/ȁ /com.GameName.Util.Interfaces���� OSoundEvent/4/ /com.GameName.Audio/int,Sound,int,int/source,sound,pitch,gain/ ���� 8DefaultCubeCollisionBox/#/ /com.GameName.Cube.Collision���� 0IWorldRegister/#/ȁ /com.GameName.Util.Interfaces���� /ICubeRegister/#/ȁ /com.GameName.Util.Interfaces���� 1IThreadRegister/#/ȁ /com.GameName.Util.Interfaces���� (ISetup/#/ȁ /com.GameName.Util.Interfaces���� @SaveCommand/1/ /com.GameName.Command.Commands/GameEngine/eng/ ���� 5SoundEngine/1/ /com.GameName.Audio/GameEngine/eng/ ���� 5Server/1/ /com.GameName.Networking/GameEngine/eng/ ���� zFace/4/ /com.GameName.Render.Model/int[],int[],int[],Material/vertexIndices,normalIndices,textureCoordIndices,material/ ���� MSetPlayerPropertyCommand/1/ /com.GameName.Command.Commands/GameEngine/eng/ ���� PPhysicsEngine/1/ /com.GameName.Physics/CollisionDispatcher/collisionDispatch/ ���� 4ItemStack/2/ /com.GameName.Items/int,int/id,size/ ���� 0Combo/1/ /com.GameName.Input/Control[]/combo/ ���� 5Client/1/ /com.GameName.Networking/GameEngine/eng/ ���� 3Console/1/ /com.GameName.Console/GameEngine/eng/ ���� UMaterial/4/ /com.GameName.Physics/float,float,Phase,String/density,cof,phase,name/ ���� Threads/#/ ���� :GameNameLogTab/1/ /com.GameName.Console/GameEngine/eng/ ���� TWorldObject/2/Ё /com.GameName.World.Object/CollisionShape,Material/shape,material/ ���m ?Command/2/Ё /com.GameName.Command/GameEngine,String/eng,name/ ���� Materials/#/ ����  Start_New/#/ /com.GameName.Main���� :IconListRender/1/ /com.GameName.Console.Base/Map/icons/ ���� HChunkRender/2/ /com.GameName.World.Render/GameEngine,Chunk/eng,chunk/ ���k 'AirCube/0/ /com.GameName.Cube.Cubes/ ���� \SoundEvent/5/ /com.GameName.Audio/int,Sound,int,int,Vector3f/source,sound,pitch,gain,pos/ ���� *Vector3f/0/ /com.GameName.Util.Vectors/ ���v NFace/2/ /com.GameName.Render.Model/int[],int[]/vertexIndices,normalIndices/ ���� /#/ က/com.GameName.Console.Base    
  )ICubeRender/#/ȁ /com.GameName.Cube.Render���� 
Phase/#/䀁 ���� OBoxShape/2/ /com.GameName.Physics.Collision/Vector3f,Vector3f/center,radius/ ���� >PhysicsThread/1/ /com.GameName.Engine.Threads/int/tickRate/ ���� 7RenderEngine/1/ /com.GameName.Render/GameEngine/eng/ ���� 9Render3D/1/Ё /com.GameName.Render.Types/GameEngine/eng/ ���� ]GUIText/5/ /com.GameName.GUI.Components/GameEngine,int,float,float,String/eng,id,x,y,text/ ���� ;Renderable/1/Ё /com.GameName.Render.Types/GameEngine/eng/ ���� NCrashReport/2/ /com.GameName.Util.Crash/String,Throwable/description,cause/ ���� ^CylinderShape/3/ /com.GameName.Physics.Collision/float,float,Vector3f/radius,height,center/ ���� XEntity/3/Ё /com.GameName.Entity/CollisionShape,Material,GameEngine/shape,material,eng/ ���� �Material/5/ /com.GameName.Render.Model/float,float[],float[],float[],Texture/specularCoefficient,ambientColour,diffuseColour,specularColour,texture/ ���� 'EntityRegistry/#/ /com.GameName.Entity���� +GLContextThread/0/ /com.GameName.Render/ ���� 9Vector3f/1/ /com.GameName.Util.Vectors/Vector3f/clone/ ���v "Registry/0/Ё /com.GameName.Util/ ��� )RegistryStorage/0/ /com.GameName.Util/ ���~ TSmartScroller/2/ /com.GameName.Console.Base/JScrollPane,JCheckBox/scrollPane,box/ ���� MotionState/#/䀁 ���� 	Type/#/䀁 ���� JForceVBOUpdateCommand/1/ /com.GameName.Command.Commands/GameEngine/eng/ ���� >LoadedWorldAccess/1/ /com.GameName.World/LoadedWorld/world/ ���n �GUITextField/8/ /com.GameName.GUI.Components/GameEngine,int,float,float,float,float,int,String/eng,id,x,y,width,height,viewSize,startText/ ���� ]Texture/3/ /com.GameName.Render.Effects/String,boolean,String/location,useMipmap,fileType/ ���� )TagEditorTab/0/ /com.GameName.Console/ ���� ,ThreadStatusTab/0/ /com.GameName.Console/ ���� GBasicFileViewer/2/ /com.GameName.Console.Base/String,Icon/name,icon/ ���� #ItemManager/#/ /com.GameName.Items���� *Material/0/ /com.GameName.Render.Model/ ���� +ModelData/0/ /com.GameName.Render.Model/ ���� @BasicLog/2/ /com.GameName.Console.Base/String,Icon/name,icon/ ���� fDensityNode/4/ /com.GameName.World.Generation/int,int,int,float/chunk_X,chunk_Y,chunk_Z,node_value/ ���r qGUIRadioButton/6/ /com.GameName.GUI.Components/GameEngine,int,float,float,float,float/eng,id,x,y,width,height/ ���� oGUIComponent/6/Ё /com.GameName.GUI.Components/GameEngine,int,float,float,float,float/eng,id,x,y,width,height/ ���� !BufferUtil/#/ /com.GameName.Util���� (TestCube/0/ /com.GameName.Cube.Cubes/ ���� hDensityGeneration/4/ /com.GameName.World.Generation/GameEngine,int,int,World/eng,seedI,scaleI,worldI/ ���s GGameThreadTracker/1/ /com.GameName.Engine.Threads/GameThread/thread/ ���� �NetworkPlayer/5/ /com.GameName.Networking/GameEngine,DataInputStream,DataOutputStream,NetworkPlayer[],int/eng,in,out,users,id/ ���� BVector3f/3/ /com.GameName.Util.Vectors/float,float,float/x,y,z/ ���v +DensityCube/0/ /com.GameName.Cube.Cubes/ ���� GGameThread/2/Ё /com.GameName.Engine.Threads/int,String/tickRate,name/ ���� $DTGLoader/#/ /com.GameName.Util.Tag���{ 'DTGGenerator/#/ /com.GameName.Util.Tag���| *Cube/1/ /com.GameName.Cube/String/name/ ���� 2EntityRegistry/#/ /co