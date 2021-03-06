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
public interface AMD_popcnt {

}                                                                                                                                                                                                                                                                                                               2dc08ae9165b473d0dda7c44
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

!ENTRY org.eclipse.egit.ui 4 0 2015-01-08 14:53:40.255
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
!SUBENTRY 1 org.eclipse.egit.ui 4 0 2015-01-08 14:53:40.256
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

!ENTRY org.eclipse.egit.ui 4 0 2015-01-08 14:55:37.535
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
!SUBENTRY 1 org.eclipse.egit.ui 4 0 2015-01-08 14:55:37.535
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

!ENTRY org.eclipse.egit.ui 4 0 2015-01-08 14:55:39.623
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
!SUBENTRY 1 org.eclipse.egit.ui 4 0 2015-01-08 14:55:39.624
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
	at org.eclipse.ui.internal.decorators.LightweightDecoratorManager$Lightw0ud"�A�����nʮ)���)(��db�}�����]����g�u{ ��}�������'���
ǰ,��,���j�Cѓ�&��A�@`���|4��cg�8�bh�C�UO�N��1�ZB�V��)ٶ��{Z-p���Rl۶m�|{���+�kB�y睲�o�L�a�N��&��L�1��4�ƃ���FbV� 1��~]\0��cx���4K�'�qAQ$&�v�\z�9%�����7e���V�^�]���I6��͑YtRd�L��)�j42�&BV��F��T}��/�h�Th�L�fYp��m�`[Aב�����)li	�f�4��v��m8Nฝ@)�Q�09����Ǐ_v�e��}2q���o9fU2�]3۷o���+��02�N�̢���6N�ol2�5�����[�%z5}Y`���,b�b�B1#1��P`j��w���X�x��\�8YN�7��X��?�qv�l\{���Q��̟SEf��Q|���7E�2�RkG�����롑�v�Dh73�	|���O�o}}}9��W�R})�&�d|{��>>x�`v�l���?��O
�$��\Bd�*2��Df�D�n%�)2�N�L�SBf�ę���_�7���ёs��qx.5�>�� �����ñw���D7\:fG�̥�0l����x�i�Rf��tRd
�2�&��o#{�l\y啗F��0I�:XjC"~��7g7�ESSS�J�ׅ�����oS<��ge��d����r[�lQ�R�(#!��lϻ�2MdL�7�����"�g�y&��J�i�s�Ο����̟ٲ���C=��pP�^�{=���ŋ��?��$]�P�=n��k��欳΂�k0��g���ر�Z!"[�@&��KA�Lb��5AӲ�0���{���|�vP:�=jU��	���>�lV��oƢ;��lU��dB�P���?���뮻>������q��sժU9�F���Ԕ;�=j�I #�#���ă>�!o�h�f


�
T���믿>gW&
z���L\|�Š�I�)((�2[�P��i�;w�,��dsU�nݚ=�}J;=�d��_�Mk��$�$N��{������io��<\+D���GϾ��>���;��->1���u%�P���#��, �C��2�}��h�+�Pf!+������̖�#߲�>�G	%��\�ܹ��h���?|D�1�    IEND�B`�                                                                                                                                                                                                                                                                                                                         ="org.eclipse.ui.edit.text.gotoLastEditPosition">
          <tags>Opaque</tags>
        </children>
      </children>
      <children xsi:type="menu:ToolBar" xmi:id="_m6k6mdGnEeSs5Ywzgc0rKA" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" visible="false">
        <tags>Draggable</tags>
      </children>
      <children xsi:type="menu:ToolBar" xmi:id="_m6k6mtGnEeSs5Ywzgc0rKA" elementId="group.editor" toBeRendered="false">
        <tags>toolbarSeparator</tags>
        <children xsi:type="menu:ToolBarSeparator" xmi:id="_m6k6m9GnEeSs5Ywzgc0rKA" elementId="group.editor" toBeRendered="false"/>
      </children>
      <children xsi:type="menu:ToolBar" xmi:id="_m6k6nNGnEeSs5Ywzgc0rKA" elementId="group.help" toBeRendered="false">
        <tags>toolbarSeparator</tags>
        <children xsi:type="menu:ToolBarSeparator" xmi:id="_m6k6ndGnEeSs5Ywzgc0rKA" elementId="group.help" toBeRendered="false"/>
      </children>
      <children xsi:type="menu:ToolBar" xmi:id="_m6k6ntGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.workbench.help" visible="false">
        <tags>Draggable</tags>
        <children xsi:type="menu:DirectToolItem" xmi:id="_m6k6n9GnEeSs5Ywzgc0rKA" elementId="group.help">
          <tags>Opaque</tags>
        </children>
        <children xsi:type="menu:DirectToolItem" xmi:id="_m6k6oNGnEeSs5Ywzgc0rKA" elementId="group.application" visible="false">
          <tags>Opaque</tags>
        </children>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6odGnEeSs5Ywzgc0rKA" elementId="PerspectiveSpacer" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.renderers.swt/org.eclipse.e4.ui.workbench.renderers.swt.LayoutModifierToolControl">
        <tags>stretch</tags>
        <tags>SHOW_RESTORE_MENU</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6pdGnEeSs5Ywzgc0rKA" elementId="PerspectiveSwitcher" contributionURI="bundleclass://org.eclipse.ui.workbench/org.eclipse.e4.ui.workbench.addons.perspectiveswitcher.PerspectiveSwitcher">
        <tags>Draggable</tags>
        <tags>HIDEABLE</tags>
        <tags>SHOW_RESTORE_MENU</tags>
      </children>
    </trimBars>
    <trimBars xmi:id="_m6k6ptGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.trim.status" side="Bottom">
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6p9GnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.StatusLine" contributionURI="bundleclass://org.eclipse.ui.workbench/org.eclipse.ui.internal.StandardTrim">
        <tags>stretch</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6qNGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.HeapStatus" toBeRendered="false" contributionURI="bundleclass://org.eclipse.ui.workbench/org.eclipse.ui.internal.StandardTrim">
        <tags>Draggable</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6qdGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.ProgressBar" contributionURI="bundleclass://org.eclipse.ui.workbench/org.eclipse.ui.internal.StandardTrim">
        <tags>Draggable</tags>
      </children>
    </trimBars>
    <trimBars xmi:id="_m6k6qtGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.trim.vertical1" toBeRendered="false" side="Left">
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6q9GnEeSs5Ywzgc0rKA" elementId="left(org.eclipse.jdt.ui.JavaPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6rNGnEeSs5Ywzgc0rKA" elementId="org.eclipse.egit.ui.RepositoriesViewMStack(org.eclipse.egit.ui.GitRepositoryExploring)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6rdGnEeSs5Ywzgc0rKA" elementId="org.eclipse.debug.internal.ui.ConsoleFolderView(org.eclipse.debug.ui.DebugPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6rtGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.editorss(org.eclipse.debug.ui.DebugPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6r9GnEeSs5Ywzgc0rKA" elementId="org.eclipse.debug.internal.ui.NavigatorFolderView(org.eclipse.debug.ui.DebugPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
    </trimBars>
    <trimBars xmi:id="_m6k6sNGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.trim.vertical2" side="Right">
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6sdGnEeSs5Ywzgc0rKA" elementId="bottom(org.eclipse.jdt.ui.JavaPerspective)" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <persistedState key="XSize" value="643"/>
        <persistedState key="YSize" value="400"/>
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6stGnEeSs5Ywzgc0rKA" elementId="right(org.eclipse.jdt.ui.JavaPerspective)" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6s9GnEeSs5Ywzgc0rKA" elementId="org.eclipse.debug.internal.ui.OutlineFolderView(org.eclipse.debug.ui.DebugPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6tNGnEeSs5Ywzgc0rKA" elementId="bottom(org.eclipse.egit.ui.GitRepositoryExploring)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6tdGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.editorss(org.eclipse.jdt.ui.JavaPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
      <children xsi:type="menu:ToolControl" xmi:id="_m6k6ttGnEeSs5Ywzgc0rKA" elementId="org.eclipse.debug.internal.ui.ToolsFolderView(org.eclipse.debug.ui.DebugPerspective)" toBeRendered="false" contributionURI="bundleclass://org.eclipse.e4.ui.workbench.addons.swt/org.eclipse.e4.ui.workbench.addons.minmax.TrimStack">
        <tags>TrimStack</tags>
      </children>
    </trimBars>
  </children>
  <bindingTables xmi:id="_m6k6t9GnEeSs5Ywzgc0rKA" contributorURI="platform:/plugin/org.eclipse.platform" bindingContext="_m6lhTdGnEeSs5Ywzgc0rKA">
    <bindings xmi:id="_m6k6uNGnEeSs5Ywzgc0rKA" keySequence="CTRL+A" command="_m6mwtNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6udGnEeSs5Ywzgc0rKA" keySequence="CTRL+SPACE" command="_m6mv7tGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6utGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+SPACE" command="_m6mv3NGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6u9GnEeSs5Ywzgc0rKA" keySequence="ALT+PAGE_DOWN" command="_m6mvZNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6vNGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+D" command="_m6mwudGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6vdGnEeSs5Ywzgc0rKA" keySequence="SHIFT+INSERT" command="_m6mJ2tGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6vtGnEeSs5Ywzgc0rKA" keySequence="CTRL+C" command="_m6mJndGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6v9GnEeSs5Ywzgc0rKA" keySequence="ALT+PAGE_UP" command="_m6mxDtGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6wNGnEeSs5Ywzgc0rKA" keySequence="CTRL+1" command="_m6mvr9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6wdGnEeSs5Ywzgc0rKA" keySequence="CTRL+V" command="_m6mJ2tGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6wtGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+L" command="_m6mwhdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6w9GnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+F3" command="_m6mwRtGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6xNGnEeSs5Ywzgc0rKA" keySequence="CTRL+F10" command="_m6mKCtGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6xdGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+I" command="_m6mvidGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6xtGnEeSs5Ywzgc0rKA" keySequence="CTRL+INSERT" command="_m6mJndGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6x9GnEeSs5Ywzgc0rKA" keySequence="CTRL+Y" command="_m6mw7tGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6yNGnEeSs5Ywzgc0rKA" keySequence="CTRL+X" command="_m6mwH9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6ydGnEeSs5Ywzgc0rKA" keySequence="CTRL+Z" command="_m6mwFNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6ytGnEeSs5Ywzgc0rKA" keySequence="SHIFT+DEL" command="_m6mwH9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6y9GnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+F1" command="_m6mvStGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6zNGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+F2" command="_m6mvQdGnEeSs5Ywzgc0rKA"/>
  </bindingTables>
  <bindingTables xmi:id="_m6k6zdGnEeSs5Ywzgc0rKA" elementId="org.eclipse.ui.contexts.window" bindingContext="_m6lhTtGnEeSs5Ywzgc0rKA">
    <bindings xmi:id="_m6k6ztGnEeSs5Ywzgc0rKA" keySequence="CTRL+B" command="_m6mJ59GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6z9GnEeSs5Ywzgc0rKA" keySequence="ALT+ARROW_RIGHT" command="_m6mwRdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k60NGnEeSs5Ywzgc0rKA" keySequence="ALT+ARROW_LEFT" command="_m6mKENGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k60dGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+D Q" command="_m6mw1dGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k60tGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+D J" command="_m6mvq9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k609GnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+D A" command="_m6mwC9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k61NGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+D T" command="_m6mJpdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k61dGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+V" command="_m6mwmNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k61tGnEeSs5Ywzgc0rKA" keySequence="CTRL+H" command="_m6mv7dGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k619GnEeSs5Ywzgc0rKA" keySequence="ALT+CTRL+G" command="_m6mvPNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k62NGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+F" command="_m6mwUdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k62dGnEeSs5Ywzgc0rKA" keySequence="CTRL+F" command="_m6mvJdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k62tGnEeSs5Ywzgc0rKA" keySequence="CTRL+G" command="_m6mJlNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k629GnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+E" command="_m6mvYtGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k63NGnEeSs5Ywzgc0rKA" keySequence="CTRL+E" command="_m6mwB9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k63dGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+G" command="_m6mw79GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k63tGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+I" command="_m6mKDNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k639GnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+H" command="_m6mJj9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k64NGnEeSs5Ywzgc0rKA" keySequence="ALT+CTRL+H" command="_m6mKAtGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k64dGnEeSs5Ywzgc0rKA" keySequence="CTRL+#" command="_m6mKC9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k64tGnEeSs5Ywzgc0rKA" keySequence="F2" command="_m6mJ5NGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k649GnEeSs5Ywzgc0rKA" keySequence="SHIFT+F5" command="_m6mwydGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k65NGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+W" command="_m6mwHdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k65dGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+M" command="_m6mwwNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k65tGnEeSs5Ywzgc0rKA" keySequence="CTRL+P" command="_m6mwOdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k659GnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+F7" command="_m6mvfNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k66NGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+T" command="_m6mJztGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k66dGnEeSs5Ywzgc0rKA" keySequence="CTRL+U" command="_m6mw5dGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k66tGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+W" command="_m6mw0NGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k669GnEeSs5Ywzgc0rKA" keySequence="F5" command="_m6mwZNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k67NGnEeSs5Ywzgc0rKA" keySequence="CTRL+N" command="_m6mw9tGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k67dGnEeSs5Ywzgc0rKA" keySequence="CTRL+{" command="_m6mv4NGnEeSs5Ywzgc0rKA">
      <parameters xmi:id="_m6k67tGnEeSs5Ywzgc0rKA" elementId="Splitter.isHorizontal" name="Splitter.isHorizontal" value="false"/>
    </bindings>
    <bindings xmi:id="_m6k679GnEeSs5Ywzgc0rKA" keySequence="CTRL+M" command="_m6mv59GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k68NGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+S" command="_m6mxKNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k68dGnEeSs5Ywzgc0rKA" keySequence="SHIFT+F2" command="_m6mKHNGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k68tGnEeSs5Ywzgc0rKA" keySequence="CTRL+F11" command="_m6mwadGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k689GnEeSs5Ywzgc0rKA" keySequence="F4" command="_m6mJ89GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k69NGnEeSs5Ywzgc0rKA" keySequence="ALT+SHIFT+R" command="_m6mw89GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k69dGnEeSs5Ywzgc0rKA" keySequence="F12" command="_m6mv8NGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k69tGnEeSs5Ywzgc0rKA" keySequence="CTRL+W" command="_m6mw_dGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k699GnEeSs5Ywzgc0rKA" keySequence="DEL" command="_m6mvOdGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6-NGnEeSs5Ywzgc0rKA" keySequence="CTRL+F7" command="_m6mJntGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6-dGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+F6" command="_m6mvI9GnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6-tGnEeSs5Ywzgc0rKA" keySequence="CTRL+SHIFT+T" command="_m6mwHtGnEeSs5Ywzgc0rKA"/>
    <bindings xmi:id="_m6k6-9GnEeSs5Ywzgc0