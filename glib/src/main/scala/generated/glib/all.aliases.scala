package glib
package all

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

export _root_.glib.aliases.GArray_autoptr
export _root_.glib.aliases.GArray_listautoptr
export _root_.glib.aliases.GArray_queueautoptr
export _root_.glib.aliases.GArray_slistautoptr
export _root_.glib.aliases.GAsyncQueue_autoptr
export _root_.glib.aliases.GAsyncQueue_listautoptr
export _root_.glib.aliases.GAsyncQueue_queueautoptr
export _root_.glib.aliases.GAsyncQueue_slistautoptr
export _root_.glib.aliases.GBookmarkFile_autoptr
export _root_.glib.aliases.GBookmarkFile_listautoptr
export _root_.glib.aliases.GBookmarkFile_queueautoptr
export _root_.glib.aliases.GBookmarkFile_slistautoptr
export _root_.glib.aliases.GByteArray_autoptr
export _root_.glib.aliases.GByteArray_listautoptr
export _root_.glib.aliases.GByteArray_queueautoptr
export _root_.glib.aliases.GByteArray_slistautoptr
export _root_.glib.aliases.GBytes_autoptr
export _root_.glib.aliases.GBytes_listautoptr
export _root_.glib.aliases.GBytes_queueautoptr
export _root_.glib.aliases.GBytes_slistautoptr
export _root_.glib.aliases.GCacheDestroyFunc
export _root_.glib.aliases.GCacheDupFunc
export _root_.glib.aliases.GCacheNewFunc
export _root_.glib.aliases.GChecksum_autoptr
export _root_.glib.aliases.GChecksum_listautoptr
export _root_.glib.aliases.GChecksum_queueautoptr
export _root_.glib.aliases.GChecksum_slistautoptr
export _root_.glib.aliases.GChildWatchFunc
export _root_.glib.aliases.GClearHandleFunc
export _root_.glib.aliases.GCompareDataFunc
export _root_.glib.aliases.GCompareFunc
export _root_.glib.aliases.GCompletionFunc
export _root_.glib.aliases.GCompletionStrncmpFunc
export _root_.glib.aliases.GCopyFunc
export _root_.glib.aliases.GDataForeachFunc
export _root_.glib.aliases.GDateDay
export _root_.glib.aliases.GDateTime_autoptr
export _root_.glib.aliases.GDateTime_listautoptr
export _root_.glib.aliases.GDateTime_queueautoptr
export _root_.glib.aliases.GDateTime_slistautoptr
export _root_.glib.aliases.GDateYear
export _root_.glib.aliases.GDate_autoptr
export _root_.glib.aliases.GDate_listautoptr
export _root_.glib.aliases.GDate_queueautoptr
export _root_.glib.aliases.GDate_slistautoptr
export _root_.glib.aliases.GDestroyNotify
export _root_.glib.aliases.GDir_autoptr
export _root_.glib.aliases.GDir_listautoptr
export _root_.glib.aliases.GDir_queueautoptr
export _root_.glib.aliases.GDir_slistautoptr
export _root_.glib.aliases.GDuplicateFunc
export _root_.glib.aliases.GEqualFunc
export _root_.glib.aliases.GEqualFuncFull
export _root_.glib.aliases.GErrorClearFunc
export _root_.glib.aliases.GErrorCopyFunc
export _root_.glib.aliases.GErrorInitFunc
export _root_.glib.aliases.GError_autoptr
export _root_.glib.aliases.GError_listautoptr
export _root_.glib.aliases.GError_queueautoptr
export _root_.glib.aliases.GError_slistautoptr
export _root_.glib.aliases.GFreeFunc
export _root_.glib.aliases.GFunc
export _root_.glib.aliases.GHFunc
export _root_.glib.aliases.GHRFunc
export _root_.glib.aliases.GHashFunc
export _root_.glib.aliases.GHashTable_autoptr
export _root_.glib.aliases.GHashTable_listautoptr
export _root_.glib.aliases.GHashTable_queueautoptr
export _root_.glib.aliases.GHashTable_slistautoptr
export _root_.glib.aliases.GHmac_autoptr
export _root_.glib.aliases.GHmac_listautoptr
export _root_.glib.aliases.GHmac_queueautoptr
export _root_.glib.aliases.GHmac_slistautoptr
export _root_.glib.aliases.GHookCheckFunc
export _root_.glib.aliases.GHookCheckMarshaller
export _root_.glib.aliases.GHookCompareFunc
export _root_.glib.aliases.GHookFinalizeFunc
export _root_.glib.aliases.GHookFindFunc
export _root_.glib.aliases.GHookFunc
export _root_.glib.aliases.GHookMarshaller
export _root_.glib.aliases.GIConv
export _root_.glib.aliases.GIOChannel_autoptr
export _root_.glib.aliases.GIOChannel_listautoptr
export _root_.glib.aliases.GIOChannel_queueautoptr
export _root_.glib.aliases.GIOChannel_slistautoptr
export _root_.glib.aliases.GIOFunc
export _root_.glib.aliases.GKeyFile_autoptr
export _root_.glib.aliases.GKeyFile_listautoptr
export _root_.glib.aliases.GKeyFile_queueautoptr
export _root_.glib.aliases.GKeyFile_slistautoptr
export _root_.glib.aliases.GList_autoptr
export _root_.glib.aliases.GList_listautoptr
export _root_.glib.aliases.GList_queueautoptr
export _root_.glib.aliases.GList_slistautoptr
export _root_.glib.aliases.GLogFunc
export _root_.glib.aliases.GLogWriterFunc
export _root_.glib.aliases.GMainContextPusher
export _root_.glib.aliases.GMainContextPusher_autoptr
export _root_.glib.aliases.GMainContextPusher_listautoptr
export _root_.glib.aliases.GMainContextPusher_queueautoptr
export _root_.glib.aliases.GMainContextPusher_slistautoptr
export _root_.glib.aliases.GMainContext_autoptr
export _root_.glib.aliases.GMainContext_listautoptr
export _root_.glib.aliases.GMainContext_queueautoptr
export _root_.glib.aliases.GMainContext_slistautoptr
export _root_.glib.aliases.GMainLoop_autoptr
export _root_.glib.aliases.GMainLoop_listautoptr
export _root_.glib.aliases.GMainLoop_queueautoptr
export _root_.glib.aliases.GMainLoop_slistautoptr
export _root_.glib.aliases.GMappedFile_autoptr
export _root_.glib.aliases.GMappedFile_listautoptr
export _root_.glib.aliases.GMappedFile_queueautoptr
export _root_.glib.aliases.GMappedFile_slistautoptr
export _root_.glib.aliases.GMarkupParseContext_autoptr
export _root_.glib.aliases.GMarkupParseContext_listautoptr
export _root_.glib.aliases.GMarkupParseContext_queueautoptr
export _root_.glib.aliases.GMarkupParseContext_slistautoptr
export _root_.glib.aliases.GMatchInfo_autoptr
export _root_.glib.aliases.GMatchInfo_listautoptr
export _root_.glib.aliases.GMatchInfo_queueautoptr
export _root_.glib.aliases.GMatchInfo_slistautoptr
export _root_.glib.aliases.GMutexLocker
export _root_.glib.aliases.GMutexLocker_autoptr
export _root_.glib.aliases.GMutexLocker_listautoptr
export _root_.glib.aliases.GMutexLocker_queueautoptr
export _root_.glib.aliases.GMutexLocker_slistautoptr
export _root_.glib.aliases.GNodeForeachFunc
export _root_.glib.aliases.GNodeTraverseFunc
export _root_.glib.aliases.GNode_autoptr
export _root_.glib.aliases.GNode_listautoptr
export _root_.glib.aliases.GNode_queueautoptr
export _root_.glib.aliases.GNode_slistautoptr
export _root_.glib.aliases.GOptionArgFunc
export _root_.glib.aliases.GOptionContext_autoptr
export _root_.glib.aliases.GOptionContext_listautoptr
export _root_.glib.aliases.GOptionContext_queueautoptr
export _root_.glib.aliases.GOptionContext_slistautoptr
export _root_.glib.aliases.GOptionErrorFunc
export _root_.glib.aliases.GOptionGroup_autoptr
export _root_.glib.aliases.GOptionGroup_listautoptr
export _root_.glib.aliases.GOptionGroup_queueautoptr
export _root_.glib.aliases.GOptionGroup_slistautoptr
export _root_.glib.aliases.GOptionParseFunc
export _root_.glib.aliases.GPathBuf_autoptr
export _root_.glib.aliases.GPathBuf_listautoptr
export _root_.glib.aliases.GPathBuf_queueautoptr
export _root_.glib.aliases.GPathBuf_slistautoptr
export _root_.glib.aliases.GPatternSpec_autoptr
export _root_.glib.aliases.GPatternSpec_listautoptr
export _root_.glib.aliases.GPatternSpec_queueautoptr
export _root_.glib.aliases.GPatternSpec_slistautoptr
export _root_.glib.aliases.GPid
export _root_.glib.aliases.GPollFunc
export _root_.glib.aliases.GPrintFunc
export _root_.glib.aliases.GPtrArray_autoptr
export _root_.glib.aliases.GPtrArray_listautoptr
export _root_.glib.aliases.GPtrArray_queueautoptr
export _root_.glib.aliases.GPtrArray_slistautoptr
export _root_.glib.aliases.GQuark
export _root_.glib.aliases.GQueue_autoptr
export _root_.glib.aliases.GQueue_listautoptr
export _root_.glib.aliases.GQueue_queueautoptr
export _root_.glib.aliases.GQueue_slistautoptr
export _root_.glib.aliases.GRWLockReaderLocker
export _root_.glib.aliases.GRWLockReaderLocker_autoptr
export _root_.glib.aliases.GRWLockReaderLocker_listautoptr
export _root_.glib.aliases.GRWLockReaderLocker_queueautoptr
export _root_.glib.aliases.GRWLockReaderLocker_slistautoptr
export _root_.glib.aliases.GRWLockWriterLocker
export _root_.glib.aliases.GRWLockWriterLocker_autoptr
export _root_.glib.aliases.GRWLockWriterLocker_listautoptr
export _root_.glib.aliases.GRWLockWriterLocker_queueautoptr
export _root_.glib.aliases.GRWLockWriterLocker_slistautoptr
export _root_.glib.aliases.GRand_autoptr
export _root_.glib.aliases.GRand_listautoptr
export _root_.glib.aliases.GRand_queueautoptr
export _root_.glib.aliases.GRand_slistautoptr
export _root_.glib.aliases.GRecMutexLocker
export _root_.glib.aliases.GRecMutexLocker_autoptr
export _root_.glib.aliases.GRecMutexLocker_listautoptr
export _root_.glib.aliases.GRecMutexLocker_queueautoptr
export _root_.glib.aliases.GRecMutexLocker_slistautoptr
export _root_.glib.aliases.GRefString
export _root_.glib.aliases.GRefString_autoptr
export _root_.glib.aliases.GRefString_listautoptr
export _root_.glib.aliases.GRefString_queueautoptr
export _root_.glib.aliases.GRefString_slistautoptr
export _root_.glib.aliases.GRegexEvalCallback
export _root_.glib.aliases.GRegex_autoptr
export _root_.glib.aliases.GRegex_listautoptr
export _root_.glib.aliases.GRegex_queueautoptr
export _root_.glib.aliases.GRegex_slistautoptr
export _root_.glib.aliases.GSList_autoptr
export _root_.glib.aliases.GSList_listautoptr
export _root_.glib.aliases.GSList_queueautoptr
export _root_.glib.aliases.GSList_slistautoptr
export _root_.glib.aliases.GScannerMsgFunc
export _root_.glib.aliases.GScanner_autoptr
export _root_.glib.aliases.GScanner_listautoptr
export _root_.glib.aliases.GScanner_queueautoptr
export _root_.glib.aliases.GScanner_slistautoptr
export _root_.glib.aliases.GSequenceIterCompareFunc
export _root_.glib.aliases.GSequence_autoptr
export _root_.glib.aliases.GSequence_listautoptr
export _root_.glib.aliases.GSequence_queueautoptr
export _root_.glib.aliases.GSequence_slistautoptr
export _root_.glib.aliases.GSourceDisposeFunc
export _root_.glib.aliases.GSourceDummyMarshal
export _root_.glib.aliases.GSourceFunc
export _root_.glib.aliases.GSourceOnceFunc
export _root_.glib.aliases.GSource_autoptr
export _root_.glib.aliases.GSource_listautoptr
export _root_.glib.aliases.GSource_queueautoptr
export _root_.glib.aliases.GSource_slistautoptr
export _root_.glib.aliases.GSpawnChildSetupFunc
export _root_.glib.aliases.GStringChunk_autoptr
export _root_.glib.aliases.GStringChunk_listautoptr
export _root_.glib.aliases.GStringChunk_queueautoptr
export _root_.glib.aliases.GStringChunk_slistautoptr
export _root_.glib.aliases.GString_autoptr
export _root_.glib.aliases.GString_listautoptr
export _root_.glib.aliases.GString_queueautoptr
export _root_.glib.aliases.GString_slistautoptr
export _root_.glib.aliases.GStrv
export _root_.glib.aliases.GStrvBuilder_autoptr
export _root_.glib.aliases.GStrvBuilder_listautoptr
export _root_.glib.aliases.GStrvBuilder_queueautoptr
export _root_.glib.aliases.GStrvBuilder_slistautoptr
export _root_.glib.aliases.GTestDataFunc
export _root_.glib.aliases.GTestFixtureFunc
export _root_.glib.aliases.GTestFunc
export _root_.glib.aliases.GTestLogFatalFunc
export _root_.glib.aliases.GThreadFunc
export _root_.glib.aliases.GThread_autoptr
export _root_.glib.aliases.GThread_listautoptr
export _root_.glib.aliases.GThread_queueautoptr
export _root_.glib.aliases.GThread_slistautoptr
export _root_.glib.aliases.GTime
export _root_.glib.aliases.GTimeSpan
export _root_.glib.aliases.GTimeZone_autoptr
export _root_.glib.aliases.GTimeZone_listautoptr
export _root_.glib.aliases.GTimeZone_queueautoptr
export _root_.glib.aliases.GTimeZone_slistautoptr
export _root_.glib.aliases.GTimer_autoptr
export _root_.glib.aliases.GTimer_listautoptr
export _root_.glib.aliases.GTimer_queueautoptr
export _root_.glib.aliases.GTimer_slistautoptr
export _root_.glib.aliases.GTranslateFunc
export _root_.glib.aliases.GTraverseFunc
export _root_.glib.aliases.GTraverseNodeFunc
export _root_.glib.aliases.GTree_autoptr
export _root_.glib.aliases.GTree_listautoptr
export _root_.glib.aliases.GTree_queueautoptr
export _root_.glib.aliases.GTree_slistautoptr
export _root_.glib.aliases.GUri_autoptr
export _root_.glib.aliases.GUri_listautoptr
export _root_.glib.aliases.GUri_queueautoptr
export _root_.glib.aliases.GUri_slistautoptr
export _root_.glib.aliases.GVariantBuilder_autoptr
export _root_.glib.aliases.GVariantBuilder_listautoptr
export _root_.glib.aliases.GVariantBuilder_queueautoptr
export _root_.glib.aliases.GVariantBuilder_slistautoptr
export _root_.glib.aliases.GVariantDict_autoptr
export _root_.glib.aliases.GVariantDict_listautoptr
export _root_.glib.aliases.GVariantDict_queueautoptr
export _root_.glib.aliases.GVariantDict_slistautoptr
export _root_.glib.aliases.GVariantIter_autoptr
export _root_.glib.aliases.GVariantIter_listautoptr
export _root_.glib.aliases.GVariantIter_queueautoptr
export _root_.glib.aliases.GVariantIter_slistautoptr
export _root_.glib.aliases.GVariantType_autoptr
export _root_.glib.aliases.GVariantType_listautoptr
export _root_.glib.aliases.GVariantType_queueautoptr
export _root_.glib.aliases.GVariantType_slistautoptr
export _root_.glib.aliases.GVariant_autoptr
export _root_.glib.aliases.GVariant_listautoptr
export _root_.glib.aliases.GVariant_queueautoptr
export _root_.glib.aliases.GVariant_slistautoptr
export _root_.glib.aliases.GVoidFunc
export _root_.glib.aliases.gatomicrefcount
export _root_.glib.aliases.gboolean
export _root_.glib.aliases.gchar
export _root_.glib.aliases.gconstpointer
export _root_.glib.aliases.gdouble
export _root_.glib.aliases.gfloat
export _root_.glib.aliases.gint
export _root_.glib.aliases.gint16
export _root_.glib.aliases.gint32
export _root_.glib.aliases.gint64
export _root_.glib.aliases.gint8
export _root_.glib.aliases.gintptr
export _root_.glib.aliases.glong
export _root_.glib.aliases.goffset
export _root_.glib.aliases.gpointer
export _root_.glib.aliases.grefcount
export _root_.glib.aliases.gshort
export _root_.glib.aliases.gsize
export _root_.glib.aliases.gssize
export _root_.glib.aliases.guchar
export _root_.glib.aliases.guint
export _root_.glib.aliases.guint16
export _root_.glib.aliases.guint32
export _root_.glib.aliases.guint64
export _root_.glib.aliases.guint8
export _root_.glib.aliases.guintptr
export _root_.glib.aliases.gulong
export _root_.glib.aliases.gunichar
export _root_.glib.aliases.gunichar2
export _root_.glib.aliases.gushort
export _root_.glib.aliases.pthread_mutex_t
export _root_.glib.aliases.pthread_t
export _root_.glib.aliases.size_t
export _root_.glib.aliases.time_t
export _root_.glib.aliases.tm
export _root_.glib.aliases.va_list
