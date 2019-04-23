<?php

namespace App\Http\Middleware;

use Session;
use Closure;

class isPeserta
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure  $next
     * @return mixed
     */
    public function handle($request, Closure $next)
    {
		if (Session::get('level') == 'peserta') {
			return $next($request);
		}
		return redirect('/');
    }
}
